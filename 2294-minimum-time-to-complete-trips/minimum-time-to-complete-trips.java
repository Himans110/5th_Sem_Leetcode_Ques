class Solution {
    public long minimumTime(int[] arr, int tt) {
        long min = 1;
        long max = (long) tt * getmin(arr); 
        long ans = -1;
        while (min <= max) {
            long mid = min + (max - min) / 2;
            if (isposs(mid, arr, tt)) {
                ans = mid; 
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return ans;
    }
    public boolean isposs(long time, int[] arr, int tar) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += time / arr[i];
            if (sum >= tar) return true;
        }
        return false;
    }
    private int getmin(int[] arr) {
        int m = arr[0];
        for (int x : arr) m = Math.min(m, x);
        return m;
    }
}
