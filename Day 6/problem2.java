class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr);
        int ciel = -1;
        int floor = -1;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] <= x){
                ciel = arr[i];
            }
        }
        for(int i=arr.length-1 ; i>=0 ; i--){
            if(arr[i] >= x){
                floor = arr[i];
            }
        }
        return new int[]{ciel,floor};
    }
}