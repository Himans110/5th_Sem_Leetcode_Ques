class Solution {
    public long minCost(int[] nums, int[] cost) {
        int n = nums.length;
        int arr[][] = new int[n][2];
        long total = 0L; 
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = cost[i];
            total += cost[i];
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        long half = 0L;
        int median = 0;
        for (int[] a : arr) {
            half += a[1];
            if (half * 2 >= total) {
                median = a[0];
                break;
            }
        }
        long ans = 0L;
        for (int[] a : arr) {
            ans += Math.abs((long)a[0] - median) * (long)a[1];
        }
        return ans;
    }
}