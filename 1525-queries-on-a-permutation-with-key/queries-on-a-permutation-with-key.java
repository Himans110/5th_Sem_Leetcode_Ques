class Solution {
    public int[] processQueries(int[] q, int m) {
        int[] p = new int[m];
        for(int i=1; i<=m; i++) {
            p[i-1] = i;
        } 
        int n = q.length;
        int[] res = new int[n];
        for(int i=0; i<n; i++) {
            int ind = 0;
            for(int j=0; j<m; j++) {
                if(q[i] == p[j]) {
                    ind = j;
                    break;
                }
            }
            res[i] = ind;
            for(int j=ind; j>0; j--) {
                int temp = p[j];
                p[j] = p[j-1];
                p[j-1] = temp;
            }
        }
        return res;
    }
}