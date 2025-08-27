class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long total = 0;
        for (int x : nums) total += x;
        long prefix = 0;
        long minDiff = Long.MAX_VALUE;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            prefix += nums[i];
            long leftAvg = prefix / (i + 1);
            long rightAvg = 0;
            if (i != n - 1) {
                rightAvg = (total - prefix) / (n - i - 1);
            }
            long diff = Math.abs(leftAvg - rightAvg);
            if (diff < minDiff) {
                minDiff = diff;
                idx = i;
            }
        }
        return idx;
    }
}