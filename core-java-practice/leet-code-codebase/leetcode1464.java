class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                int num = (nums[i]-1)*(nums[j]-1);
                max = Math.max(num,max);
                }
            }
        }
        return max;
    }
}

public class leetcode1464 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 4, 5, 2};
        System.out.println(solution.maxProduct(nums));
    }
}