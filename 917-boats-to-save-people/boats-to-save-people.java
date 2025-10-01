class Solution {
    public int numRescueBoats(int[] p, int limit) {
        Arrays.sort(p);
        int i = 0, j = p.length - 1;
        int c = 0;
        while (i <= j) {
            if (p[i] + p[j] <= limit) {
                i++;
                j--;
            } else {
                j--;
            }
            c++;
        }
        return c;
        
    }
}