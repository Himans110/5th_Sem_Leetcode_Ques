class Solution {
    public long splitArray(int[] nums) {
        int n = nums.length;
        boolean[] inc = new boolean[n];
        inc[0] = true;
        for (int i = 1; i < n; i++) {
            inc[i] = nums[i] > nums[i - 1] && inc[i - 1];
        }
        boolean[] dec = new boolean[n];
        dec[n - 1] = true;
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = nums[i] > nums[i + 1] && dec[i + 1];
        }
        long[] pref = new long[n];
        pref[0] = nums[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + nums[i];
        }
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            if (inc[i] && dec[i + 1]) { 
                long l = pref[i];            
                long r = pref[n - 1] - pref[i]; 
                ans = Math.min(ans, Math.abs(l - r));
            }
        }
        return (ans == Long.MAX_VALUE) ? -1 : ans;
    }
}