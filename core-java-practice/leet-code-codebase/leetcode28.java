class Leetcode28 {
    public int strStr(String haystack, String needle) {
        int winSize = needle.length();
        if (haystack.equals(needle)) {
            return 0;
        }
        for (int i = 0; i <= (haystack.length() - winSize); i++) {
            if (haystack.substring(i, i + winSize).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Leetcode28 solution = new Leetcode28();
        String haystack = "hello";
        String needle = "ll";
        System.out.println(solution.strStr(haystack, needle));

        haystack = "aaaaa";
        needle = "bba";
        System.out.println(solution.strStr(haystack, needle));
    }
}