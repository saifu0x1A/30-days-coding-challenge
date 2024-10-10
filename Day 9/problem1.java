class Solution {
    public int mySqrt(int x) {
        int low = 1, high = x;
        while(low <= high){
            int mid = (low + high)/2;
            int val = mid * mid;
            if(val <= x){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return high;
    }
}