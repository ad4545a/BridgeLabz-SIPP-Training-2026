class Solution {
    public boolean isHappy(int n) {
        int store = n;
        int newnum = 0;
        while(true){
            newnum=newNum(store,newnum);
            store = newnum;
            if(newnum == 1){
                return true;
            }
            else if(newnum == 4){
                return false;
            }
            newnum = 0;
        }
        
    }
    public int newNum(int n,int newnum){
        while(n>0){
            int temp = n%10;
            newnum += temp*temp;
            n = n/10; 
        }
        return newnum;
    }
}