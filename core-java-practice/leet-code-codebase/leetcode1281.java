class Leetcode1281 {
    public int subtractProductAndSum(int n) {
        int a = sum(n);
        int b = multi(n);
        return b - a;
    }

    public int sum(int n) {
        int ans = 0;
        while (n > 0) {
            int temp = n % 10;
            ans += temp;
            n = n / 10;
        }
        return ans;
    }

    public int multi(int n) {
        int ans = 1;
        while (n > 0) {
            int temp = n % 10;
            ans *= temp;
            n = n / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Leetcode1281 solution = new Leetcode1281();
        int[] testValues = {234, 4421, 111};
        for (int value : testValues) {
            int result = solution.subtractProductAndSum(value);
            System.out.printf("%d -> %d%n", value, result);
        }
    }
}