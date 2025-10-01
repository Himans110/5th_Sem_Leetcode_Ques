class Solution {
    public int numWaterBottles(int b, int e) {
        int ans = b;
        while((b / e) > 0){
            ans += (b/e);
            b = (b/e)+(b % e);
        }
        return ans;
    }
}