class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int lo = i+1;
            int hi = nums.length-1;
            while(lo < hi){
                int sum = nums[i]+nums[lo]+nums[hi];
                if(nums[i]+nums[lo]+nums[hi] == 0){
                    l.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                    while (lo < hi && nums[hi] == nums[hi - 1]) hi--;
                    lo++;
                    hi--;
                }
                else if(sum < 0){
                    lo++;
                }
                else{
                    hi--;
                }
            }
        }
        return l;
    }
}