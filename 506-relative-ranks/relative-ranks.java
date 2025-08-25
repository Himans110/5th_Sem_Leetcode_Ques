class Solution {
    public String[] findRelativeRanks(int[] s) {
        int n = s.length;
        String[] arr = new String[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]   
        );
        for (int i = 0; i < n; i++) {
            pq.add(new int[]{s[i], i});
        }
        int rank = 1;
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int idx = cur[1];
            if (rank == 1) {
                arr[idx] = "Gold Medal";
            } else if (rank == 2) {
                arr[idx] = "Silver Medal";
            } else if (rank == 3) {
                arr[idx] = "Bronze Medal";
            } else {
                arr[idx] = String.valueOf(rank);
            }
            rank++;
        }
        return arr;
    }
}
