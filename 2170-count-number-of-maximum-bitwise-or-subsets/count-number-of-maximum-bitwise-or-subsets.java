class Solution {
    int maxOr = 0;
    int count = 0;
    public int countMaxOrSubsets(int[] nums) {
        for (int x : nums) maxOr |= x;
        solve(nums, 0, 0);
        return count;
    }

    void solve(int[] nums, int idx, int curr) {
        if (idx == nums.length) {
            if (curr == maxOr) count++;
            return;
        }
        solve(nums, idx + 1, curr | nums[idx]);
        solve(nums, idx + 1, curr);
    }
}
