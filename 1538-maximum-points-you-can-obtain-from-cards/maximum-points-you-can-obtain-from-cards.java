class Solution {
    public int maxScore(int[] c, int k) {
        int n = c.length - k;
        int total = 0;
        for(int i : c){
            total+=i;
        }
        int currsum = 0;
        for(int i = 0 ; i < n ; i++ ){
            currsum += c[i];
        }
        int minsum = currsum;
        for(int i = n ; i < c.length ; i++){
            currsum += c[i]-c[i-n];
            minsum = Math.min(minsum,currsum);
        }
        return total-minsum;
    }
}