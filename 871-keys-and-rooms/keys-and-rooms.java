class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] open = new boolean[n];
        open[0] = true;
        boolean change = true;
        while (change) {
            change = false;
            for (int i = 0; i < n; i++) {
                if (open[i]) {
                    for (int key : rooms.get(i)) {
                        if (!open[key]) {
                            open[key] = true;
                            change = true;
                        }
                    }
                }
            }
        }
        for (boolean b : open) {
            if (!b) return false;
        }
        return true;
    }
}
