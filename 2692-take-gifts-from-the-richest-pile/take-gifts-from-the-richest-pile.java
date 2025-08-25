class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : gifts){
            pq.add(i);
        }
        while(k-- > 0){
            int max = pq.poll();
            int reduced = (int) Math.floor(Math.sqrt(max));
            pq.add(reduced);
        }
        long sum = 0;
        while(!pq.isEmpty()){
            sum += pq.poll();
        }
        return sum;
    }
}