class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> l = new ArrayList<>(map.values());
        Collections.sort(l);
        int removed = 0;
        int idx = 0;
        while (idx < l.size() && k > 0) {
            int freq = l.get(idx);
            if (k >= freq) {
                k -= freq;
                removed++;
            } else {
                break;
            }
            idx++;
        }
        return l.size() - removed;
    }
}