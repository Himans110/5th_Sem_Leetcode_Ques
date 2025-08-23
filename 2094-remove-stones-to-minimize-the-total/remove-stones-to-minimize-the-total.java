class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int o : piles) {
            pq.add(o);
        }
        while (k-- > 0) {
            int max = pq.poll();
            pq.add((max + 1) / 2);
        }
        int sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }
}