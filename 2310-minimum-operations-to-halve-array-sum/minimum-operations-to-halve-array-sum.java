class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double sum = 0;
        for (int num : nums) {
            pq.add((double) num);
            sum += num;
        }
        double target = sum / 2.0;
        int k = 0;
        while (sum > target) {
            double max = pq.poll();
            double half = max / 2.0;
            sum -= (max - half);
            pq.add(half);
            k++;
        }
        
        return k;
    }
}