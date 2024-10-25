class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;

        int s2=0;
        for(int i=0; i<n; i++){
            s2 += nums[i];
        }
        int missingNum = sum-s2;
        return missingNum;
    }
}