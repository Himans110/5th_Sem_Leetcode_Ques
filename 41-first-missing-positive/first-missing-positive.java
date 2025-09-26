class Solution {
    public int firstMissingPositive(int[] nums){
        HashSet<Integer> h = new HashSet<>();
        for(int i : nums){
            h.add(i);
        }
        int c = 1;
        while(h.contains(c)){
            c++;
        }
        return c;
    }
}