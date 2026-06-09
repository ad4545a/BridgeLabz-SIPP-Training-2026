class Solution {
    public int subtractProductAndSum(int n) {
        int a = sum(n);
        int b = multi(n);
        return b-a;
    }
    public int sum(int n){
        int ans = 0;
        while(n>0){
            int temp = n%10;
            ans += temp;
            n = n/10;
        }
        return ans;
    }
    public int multi(int n){
        int ans = 1;
        while(n>0){
            int temp = n%10;
            ans *= temp;
            n = n/10;
        }
        return ans;
    }
}