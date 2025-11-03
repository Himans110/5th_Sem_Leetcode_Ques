class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums);
        fun(nums, 0 , ans , l);
        List<List<Integer>> fans = new ArrayList<>();
        for(List<Integer> i : ans){
            fans.add(i);
        }
        return fans;
    }
    public void fun(int nums[] , int idx , HashSet<List<Integer>> ans , List<Integer> l){
        if(idx == nums.length){
            ans.add(new ArrayList<>(l));
            return;
        }
        fun(nums, idx+1, ans , l);
        l.add(nums[idx]);
        fun(nums, idx+1 , ans , l);
        l.remove(l.size()-1);
    }
}