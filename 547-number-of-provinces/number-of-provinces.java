class Solution {
    public int findCircleNum(int[][] arr) {
        return bft(arr);
    }

    public int bft(int[][] arr) {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        int c = 0;

        for (int i = 0; i < arr.length; i++) {
            if (visited.contains(i)) continue;

            c++;
            q.add(i);

            while (!q.isEmpty()) {
                int r = q.poll();
                if (visited.contains(r)) continue;

                visited.add(r);

                for (int j = 0; j < arr.length; j++) {
                    if (arr[r][j] == 1 && !visited.contains(j)) {
                        q.add(j);
                    }
                }
            }
        }
        return c;
    }
}
