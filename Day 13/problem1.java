class Solution {
    public boolean isPalindrome(int x) {
        if(x  0){
            return false;
        }

        int reverseOfx=0;
        int copyOfx=x;

        while(copyOfx!=0){
            reverseOfx=(reverseOfx10)+(copyOfx%10);
            copyOfx=copyOfx10;
        }
        return reverseOfx==x;
    }
}