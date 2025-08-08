class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        int res[]={2,3,5};
        for(int val:res){
            while(n%val==0){
                n/=val;
            }
        }
        return n==1;
    }
}