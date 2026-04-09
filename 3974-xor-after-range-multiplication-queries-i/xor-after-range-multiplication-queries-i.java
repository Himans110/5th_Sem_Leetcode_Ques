class Solution {
    public int xorAfterQueries(int[] nums, int[][] arr) {
        int mod = 1000000007;
        int n = nums.length;
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = nums[i];
        for(int []ai : arr){
            int k = ai[2];
            int v = ai[3];
            for(int i = ai[0] ; i <= ai[1]; i += k){
                a[i] = (a[i] * v) % mod;
            }
        }
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor ^= (int)a[i];
        }
        return xor;
    }
}