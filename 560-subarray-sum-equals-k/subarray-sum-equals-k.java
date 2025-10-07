class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int pre[] = new int[n];
        pre[0] = nums[0];
        for(int i = 1 ; i< n ; i++){
            pre[i] = pre[i-1]+nums[i];
        }
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if(pre[i] == k) count++;
            for(int j = 0 ; j < i ; j++){
                if(pre[i]-pre[j] == k) count++;
            }
        }
        return count;
    }
}