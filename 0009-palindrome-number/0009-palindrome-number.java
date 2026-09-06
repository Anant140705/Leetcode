class Solution {
    public boolean isPalindrome(int x) {
        int a = x;
        int num = 0;
        while(x>0){
            num = num*10 + x%10;
            x=x/10;
        }
        return a==num;
    }
}