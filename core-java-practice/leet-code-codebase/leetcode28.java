class Solution {
    public int strStr(String haystack, String needle) {
        int winSize = needle.length();
        if(haystack.equals(needle)){
            return 0;
        }
        for(int i=0;i<=(haystack.length()-winSize);i++){
            if(haystack.substring(i,i+winSize).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}