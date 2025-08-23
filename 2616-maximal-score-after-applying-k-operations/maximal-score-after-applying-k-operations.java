class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            pq.add(num);
        }
        long score = 0;
        while (k-- > 0) {
            int max = pq.poll();
            score += max;
            pq.add((max + 2) / 3);  
        }
        return score;
    }
}