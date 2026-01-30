class Solution {
    int n;
    int []pre;
    public int minZeroArray(int[] nums, int[][] arr) {
        int c= 0;
        for(int i : nums){
            if(i == 0) c++;
        }
        if(c == nums.length) return 0;
        n = nums.length;
        pre = new int[n+1];
        int i = 0, j = arr.length-1;
        int ans = -1;
        while(i <= j){
            int mid = i+(j-i)/2;
            if(check(arr, mid, nums)){
                ans = mid+1;
                j = mid-1;
            }
            else{
                i = mid+1;
            }
        }
        return ans;
    }
    public boolean check(int [][]arr, int mid, int []nums){
        Arrays.fill(pre, 0);
        for(int i = 0 ; i<= mid ; i++){
            int l = arr[i][0];
            int r = arr[i][1]+1;
            int v = arr[i][2];
            pre[l] += v;
            pre[r] -= v;
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