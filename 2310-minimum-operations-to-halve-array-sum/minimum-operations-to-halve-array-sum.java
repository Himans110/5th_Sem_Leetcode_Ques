class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double  sum = 0;
        for(int i=0; i<nums.length; i++) {
            pq.add((double)nums[i]);
            sum += nums[i];
        }
        double target = sum / 2.0;
        double rsum = sum;
        int count = 0;
        while(rsum > target) {
            double max = pq.remove();
            double half = max / 2.0;
            rsum -= (max - half);
            pq.add(half);
            count++;
        }
        return count;
    }
}