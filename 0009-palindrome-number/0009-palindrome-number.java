class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int sum=0;
        while(x>0){
            sum=(x%10)+(sum*10);
            x/=10;
        }
        return (temp==sum);
    }
}