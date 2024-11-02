class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sumofall=0, n=weights.length;
        int maxofele = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            maxofele = Math.max(maxofele,weights[i]);
            sumofall += weights[i];
        }
        int low = maxofele;
        int high = sumofall;
        int min = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + ((high-low)/2);
            int reqdays=0, sum=0;
            for(int i=0; i<n; i++){
                sum += weights[i];
                if(sum > mid){
                    sum = weights[i];
                    reqdays++;
                }
            }
            reqdays++;
            if(reqdays <= days){
                min = Math.min(min,mid);
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return min;
    }
}