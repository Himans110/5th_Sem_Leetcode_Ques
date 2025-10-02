class Solution {
    public int maxBottlesDrunk(int b, int e) {
        int ans = b;
        int empty = b;
        while (empty >= e) {
            empty -= e;
            e++;
            ans++;
            empty++;
        }
        return ans;
    }
}