class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> h = new HashSet<>();
        for(int i : nums){
            h.add(i);
        }
        int i = 1;
        while (true) {
            int multiple = k * i;
            if (!h.contains(multiple)) {
                return multiple;
            }
            i++;
        }
    }
}