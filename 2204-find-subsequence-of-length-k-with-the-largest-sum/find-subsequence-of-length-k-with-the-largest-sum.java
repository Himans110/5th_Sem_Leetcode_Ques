class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < nums.length; i++) {
            pq.add(new int[]{nums[i], i});
            if (pq.size() > k) pq.poll();  
        }
        int[][] arr = pq.toArray(new int[0][]);
        Arrays.sort(arr, (a, b) -> a[1] - b[1]);
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = arr[i][0];
        }
        return ans;
    }
}