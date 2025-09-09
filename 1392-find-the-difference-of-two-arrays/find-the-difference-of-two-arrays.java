class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> a = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        for (int num : set1) {
            if (!set2.contains(num)) {
                l1.add(num);
            }
        }
        for (int num : set2) {
            if (!set1.contains(num)) {
                l2.add(num);
            }
        }
        a.add(l1);
        a.add(l2);
        return a;
    }
}