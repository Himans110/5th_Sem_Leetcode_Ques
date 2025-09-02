class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1); 
        for(int ind=0;ind<=n-1;ind++){
            for(int prev=0;prev<=ind-1;prev++){
            if(nums[ind]>nums[prev])
                dp[ind]=Math.max(dp[ind],1+dp[prev]);
            }
        }
        int ans=1;
        for(int ind=0;ind<=n-1;ind++){
            ans=Math.max(ans,dp[ind]);
        }
        return ans;
    }
}