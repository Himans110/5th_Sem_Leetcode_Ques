class Solution {
    public int maxDistance(int[] arr, int m) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            min = Math.min(min,i);
            max = Math.max(max,i);
        }
        int ans = -1;
        int lo = 1, hi = max-min;
        while(lo <= hi){
            int mid = lo+(hi - lo)/2;
            if(isposs(arr,mid,m)){
                ans = mid;
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        return ans;
    }
    public boolean isposs(int arr[] , int mid , int m){
        int pos = arr[0];
        int c = 1;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i]-pos >= mid){
                c++;
                pos = arr[i];
            }
        }
        return c>=m;
    }
}