class Solution {
    public int minCost(int n) {
        int ans = n-1;
        return ans *(ans + 1)/2;
    }
}