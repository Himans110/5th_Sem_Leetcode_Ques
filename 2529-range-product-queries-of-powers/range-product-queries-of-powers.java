class Solution {
    public int[] productQueries(int n, int[][] q) {
        List<Integer> a = new ArrayList<>();
        int k = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                a.add(1 << k); 
            }
            k++;
            n >>= 1;
        }
        int MOD = 1_000_000_007;
        int[] arr = new int[q.length];
        for (int i = 0; i < q.length; i++) {
            int si = q[i][0];
            int en = q[i][1];
            long mul = 1;
            for (int j = si; j <= en; j++) {
                mul = (mul * a.get(j)) % MOD;
            }
            arr[i] = (int) mul;
        }
        return arr;
    }
}