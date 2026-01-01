class Solution {
    public List<String> watchedVideosByFriends(List<List<String>> w, int[][] friends, int id, int level) {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        HashMap<String , Integer> freq = new HashMap<>();
        int l = 0;
        q.add(id);
        visited.add(id);
        while (!q.isEmpty()) {
            int size = q.size();
            if (l == level) break;
            for (int i = 0; i < size; i++) {
                int r = q.poll();
                for (int nbrs : friends[r]) {
                    if (!visited.contains(nbrs)) {
                        visited.add(nbrs);
                        q.add(nbrs);
                    }
                }
            }
            l++;
        }
        while (!q.isEmpty()) {
            int k = q.poll();
            for (String video : w.get(k)) {
                freq.put(video, freq.getOrDefault(video, 0) + 1);
            }
        }
        List<String> ans = new ArrayList<>(freq.keySet());
        Collections.sort(ans, (a, b) -> {
            if (!freq.get(a).equals(freq.get(b)))
                return freq.get(a) - freq.get(b);
            return a.compareTo(b);
        });
        return ans;
    }
}