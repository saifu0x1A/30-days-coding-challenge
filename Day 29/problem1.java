class Solution {
    public String largestOddNumber(String num) {
        int len = num.length() - 1;

        while(len >= 0){
            int d = num.charAt(len) - '0';
            if(d%2 != 0)
                return num.substring(0, len+1);
            len--;
        }
        return "";
    }
}