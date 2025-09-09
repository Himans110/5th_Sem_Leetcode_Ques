class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> a = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }
        for(int key : map.keySet()){
            if(!map2.containsKey(key)) l1.add(key);
        }
        for(int key : map2.keySet()){
            if(!map.containsKey(key)) l2.add(key);
        }
        a.add(l1);
        a.add(l2);
        return a;
    }
}