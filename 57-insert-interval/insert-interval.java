class Solution {
    public int[][] insert(int[][] arr, int[] narr) {
        List<int[]> l = new ArrayList<>(Arrays.asList(arr));
        l.add(narr);
        Collections.sort(l, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();
        int[] cur = l.get(0);

        for (int i = 1; i < l.size(); i++) {
            int[] intv = l.get(i);
            
            if (cur[1] >= intv[0]) {
                cur[1] = Math.max(cur[1], intv[1]);
            } else {
                res.add(cur);
                cur = intv;
            }
        }
        res.add(cur);
        return res.toArray(new int[res.size()][]);
    }
}