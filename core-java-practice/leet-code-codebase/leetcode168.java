class Leetcode168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            char ch = (char) ('A' + (columnNumber % 26));
            ans.append(ch);
            columnNumber /= 26;
        }

        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        Leetcode168 solution = new Leetcode168();
        int[] testValues = {1, 26, 27, 52, 701};
        for (int value : testValues) {
            String title = solution.convertToTitle(value);
            System.out.printf("%d -> %s%n", value, title);
        }
    }
}