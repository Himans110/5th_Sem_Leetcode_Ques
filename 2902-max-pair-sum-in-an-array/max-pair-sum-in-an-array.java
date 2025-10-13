class Solution {
    public int maxSum(int[] nums) {
       HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int n : nums) {
            int d = max(n);
            map.putIfAbsent(d, new ArrayList<>());
            map.get(d).add(n);
        }
        int ans = -1;
        for (List<Integer> list : map.values()) {
            if (list.size() < 2) continue;
            Collections.sort(list, Collections.reverseOrder());
            ans = Math.max(ans, list.get(0) + list.get(1));
        }
        return ans;
    }
    public int max(int n){
        int max = 0;
        while(n > 0){
            max = Math.max(max, n % 10);
            n = n / 10;
        }
        return max;
    }
}