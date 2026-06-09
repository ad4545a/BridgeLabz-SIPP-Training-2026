class Leetcode09 {
    public boolean isPalindrome(int x) {
        int num = x;
        int originalNum = num;
        int reversedNum = 0;

        if (num < 0) {
            return false;
        }

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        Leetcode09 solution = new Leetcode09();

        int[] testValues = {121, -121, 10, 12321, 123};
        for (int value : testValues) {
            boolean result = solution.isPalindrome(value);
            System.out.printf("%d is palindrome? %b%n", value, result);
        }
    }
}