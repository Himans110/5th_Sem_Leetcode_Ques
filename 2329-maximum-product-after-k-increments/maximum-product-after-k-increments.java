class Solution {
    private static final long MOD = 1_000_000_007L;
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x : nums) pq.add(x);
        while (k-- > 0) {
            int x = pq.poll();
            pq.add(x + 1);
        }

        long prod = 1;
        while (!pq.isEmpty()) {
            prod = (prod * pq.poll()) % MOD;
        }
        return (int) prod;
    }
}
