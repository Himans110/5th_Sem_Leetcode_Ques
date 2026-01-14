class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l = 0;
        HashSet<Integer> s = new HashSet<>();
        int sum = 0;
        int maxs = 0;
        for(int r = 0; r < nums.length; r++){
            while(s.contains(nums[r])){
                s.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
            s.add(nums[r]);
            sum += nums[r];
            maxs = Math.max(maxs, sum);
        }
        return maxs;
    }
}