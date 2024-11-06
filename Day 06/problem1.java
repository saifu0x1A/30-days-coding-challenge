class Solution {
    public int searchInsert(int[] nums, int target) {  //same as lower bound
        int n = nums.length;
        int low = 0, high = n-1;
        int ans = n;

        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] >= target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7};
        System.out.println("The index is: " + sameLowerBound(arr, 6));
    }
}