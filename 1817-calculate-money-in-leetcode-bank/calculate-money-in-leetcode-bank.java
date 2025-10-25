class Solution {
    public int totalMoney(int n) {
        int st = 1;
        int old = 1; 
        int ans = 0;  
        int day = 0;
        while (n-- > 0) {
            ans += st;
            st++;
            day++;
            if (day == 7) {
                old++;
                st = old;
                day = 0;
            }
        }
        return ans;
    }
}