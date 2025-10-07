class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];
            // If number is negative, swap max and min
            if (n < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(n, maxProd * n);
            minProd = Math.min(n, minProd * n);
            ans = Math.max(ans, maxProd);
        }
        return ans;
    }
}