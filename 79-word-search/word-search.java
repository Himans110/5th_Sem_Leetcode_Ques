class Solution {
    public boolean exist(char[][] b, String w) {
        int m = b.length, n = b[0].length;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(b[i][j] == w.charAt(0)){
                    if(find(b,w,i,j,0)) return true;
                }
            }
        }
        return false;
    }
    public boolean find(char b[][], String w , int cr ,int cc, int idx){
        if(idx == w.length()) return true;
        if(cr < 0 || cr >= b.length || cc < 0 || cc >= b[0].length || w.charAt(idx) != b[cr][cc]) return false;
        b[cr][cc] = '*';
        int r[] = {-1,0,1,0};
        int c[] = {0,-1,0,1};
        for(int k = 0 ; k < c.length ; k++){
            boolean ans = find(b, w, cr+r[k] , cc+c[k],idx+1);
            if(ans == true){
                return true;
            }
        }
        b[cr][cc] = w.charAt(idx);
        return false;
    }
}