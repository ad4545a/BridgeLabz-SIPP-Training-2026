class Solution {
    public int romanToInt(String s) {
        int num = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int value = getValue(s.charAt(i));

            // If the next Roman numeral is larger, subtract the current value
            if (i + 1 < length && value < getValue(s.charAt(i + 1))) {
                num -= value;
            } else {
                num += value;
            }
        }

        return num;
    }

    private int getValue(char roman) {
        switch (roman) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}