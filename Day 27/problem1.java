class Solution {
    public int findKthPositive(int[] nums, int k) {

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= k){
                k++;
            }else{
                break;
            }
        }
        return k;
    }
}