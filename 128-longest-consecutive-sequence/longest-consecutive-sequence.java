class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        TreeSet<Integer> h = new TreeSet<>();
        for(int i : nums){
            h.add(i);
        }
        List<Integer> l = new ArrayList<>();
        for(int i : h){
            l.add(i);
        }
        int max = 1;
        int count = 1;
        for(int i = 1; i < l.size(); i++){
            if(l.get(i) - l.get(i-1) == 1){
                count++;
            } 
            else{
                count = 1;
            }
            max = Math.max(count, max);
        }

        return max;
    }
}