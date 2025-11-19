class Solution {
    public int findFinalValue(int[] nums, int o) {
        HashSet<Integer> h = new HashSet<>();
        for(int i: nums) h.add(i);
        while(h.contains(o)){
            o *= 2;
        }
        return o;
    }
}