class Solution {
    public int maxProfit(int[] arr) {
        int ans = 0;
        int prev = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(prev < arr[i]){
                ans = Math.max(ans, arr[i]-prev);
            }
            else{
                prev = arr[i];
            }
        }
        return ans;
    }
}