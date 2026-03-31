class Solution {
    public int getKth(int lo, int hi, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            if(a[1]==b[1]) return a[0]-b[0];
            return a[1]-b[1];
        });
         for (int i = lo; i <= hi; i++) {
            int dp[] = new int[10000];
            Arrays.fill(dp, -1);
            pq.offer(new int[]{i, steps(i, dp)});
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
    public int steps(int n, int dp[]){
        if (n == 1) return 0;
        if (n < dp.length && dp[n] != -1) return dp[n];
        int res;
        if (n % 2 == 0) {
            res = 1 + steps(n / 2, dp);
        } else {
            res = 1 + steps(3 * n + 1, dp);
        }
        if (n < dp.length) dp[n] = res;
        return res;
    }
}