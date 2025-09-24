class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int []arr = new int[k];
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for(int i[] : logs){
            int key = i[0];
            int value = i[1];
            map.putIfAbsent(key, new HashSet<>());
            map.get(key).add(value);
        }
        for (int user : map.keySet()) {
            int uam = map.get(user).size();
            arr[uam - 1]++;
        }
        return arr;


    }
}