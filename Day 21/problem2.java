class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0, ones  = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                zeros++;
            if(nums[i] == 1)
                ones++;
        }

        for(int i = 0; i < nums.length; i++) {
            if(i < zeros) nums[i] = 0;
            if(zeros <= i && i < zeros + ones) nums[i] = 1;
            if(i >= zeros + ones) nums[i] = 2;
        }
    }
}