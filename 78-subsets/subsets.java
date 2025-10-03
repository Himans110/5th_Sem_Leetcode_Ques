class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        fun(nums,0,l,ans);
        return l;
    }
    public void fun(int nums[] , int idx , List<List<Integer>> l , List<Integer> ans){
        if(idx == nums.length){
            l.add(new ArrayList<>(ans));
            return;
        }
        fun(nums, idx+1,l,ans);
        ans.add(nums[idx]);
        fun(nums, idx+1,l,ans);
        ans.remove(ans.size()-1);
    }
}