class Solution {
    public char kthCharacter(int k) {
        int count = 0 ;
        for(int i=10 ; i>=0 ; i--)
            if(k > Math.pow(2,i)){
                k -= Math.pow(2,i); count++;
            }
        return (char) ('a' + count);
    }
}
