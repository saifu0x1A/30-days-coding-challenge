class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi=0, count=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
            }else{
                count = 0;
            }
            maxi = Math.max(maxi, count);
        }
        return maxi;
    }
}