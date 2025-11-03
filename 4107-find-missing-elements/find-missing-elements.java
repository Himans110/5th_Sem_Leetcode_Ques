class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        List<Integer> check = new ArrayList<>();
        for(int i : nums){
            min = Math.min(i, min);
            max = Math.max(i , max);
            check.add(i);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = min ; i<= max ; i++){
            if(!check.contains(i)) ans.add(i);
        }
        return ans;
    }
}