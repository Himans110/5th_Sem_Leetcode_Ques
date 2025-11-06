class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        int n = nums.length;
        Boolean dp[][] = new Boolean[n][sum/2 + 1];
       if(sum % 2 == 0) return fun(n-1,sum/2, nums, dp);
       return false;
    }
    public static boolean fun(int idx, int target, int arr[], Boolean dp[][]) {
        if (target == 0) return true;
        if (idx == 0) return arr[0] == target;

        if (dp[idx][target] != null) return dp[idx][target];

        boolean notTake = fun(idx - 1, target, arr, dp);
        boolean take = false;
        if (target >= arr[idx]) take = fun(idx - 1, target - arr[idx], arr, dp);

        return dp[idx][target] = notTake || take;
    }
}