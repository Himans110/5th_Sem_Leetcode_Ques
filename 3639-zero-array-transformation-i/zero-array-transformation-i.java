class Solution {
    public boolean isZeroArray(int[] nums, int[][] arr) {
        int n = nums.length;
        int pre[] = new int[n+1];
        for(int a[] : arr){
            int l = a[0];
            int r = a[1]+1;
            pre[l] += 1;
            pre[r] -= 1;
        }
        for(int i = 1 ; i< pre.length ; i++){
            pre[i] = pre[i]+pre[i-1];
        }
        for(int i = 0 ; i < nums.length; i++){
            if(pre[i] < nums[i]) return false;
        }
        return true;
    }
}