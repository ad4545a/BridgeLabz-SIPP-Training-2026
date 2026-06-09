class Leetcode202 {
    public boolean isHappy(int n) {
        int store = n;
        int newnum = 0;
        while (true) {
            newnum = newNum(store, newnum);
            store = newnum;
            if (newnum == 1) {
                return true;
            } else if (newnum == 4) {
                return false;
            }
            newnum = 0;
        }
    }

    public int newNum(int n, int newnum) {
        while (n > 0) {
            int temp = n % 10;
            newnum += temp * temp;
            n = n / 10;
        }
        return newnum;
    }

    public static void main(String[] args) {
        Leetcode202 solution = new Leetcode202();
        int[] testValues = {19, 2, 7, 20};
        for (int value : testValues) {
            boolean result = solution.isHappy(value);
            System.out.printf("%d -> %b%n", value, result);
        }
    }
}