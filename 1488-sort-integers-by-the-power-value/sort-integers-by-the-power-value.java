class Solution {
    public int getKth(int lo, int hi, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            if(a[1]==b[1]) return a[0]-b[0];
            return a[1]-b[1];
        });
         for (int i = lo; i <= hi; i++) {
            pq.offer(new int[]{i, steps(i)});
        }
        while(!pq.isEmpty()){
            int[] r = pq.poll();
            if (k == 1) {
                return r[0];
            }
            k--;
        }
        return -1;
    }
    public int steps(int num){
        if (num == 1) {
            return 0;
        }
        int next = (num % 2 == 0) ? num / 2 : num*3+1;
        int count = steps(next) + 1;
        return count;
    }
}