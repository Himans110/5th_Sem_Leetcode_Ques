class Solution {
    public int maxArea(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        int ans = Integer.MIN_VALUE;
        while(i <= j){
            int hi = Integer.min(arr[i], arr[j]);
            int wi = j-i;
            ans = Math.max(ans, hi*wi);
            if(arr[i] < arr[j]) i++;
            else j--;
        }
        return ans;
    }
}