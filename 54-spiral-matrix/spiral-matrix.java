class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        int tr = 0 , br = m.length-1 , lc = 0 , rc = m[0].length-1;
        List<Integer> l = new ArrayList<>();
        int total = m.length*m[0].length;
        while(tr <= br && lc <= rc){
            for(int i = lc ; i <= rc ; i++){
                l.add(m[tr][i]);
            }
            tr++;
            for(int i = tr ; i <= br ; i++){
                l.add(m[i][rc]);
            }
            rc--;
            if (tr <= br) {
                for (int i = rc; i >= lc; i--) {
                    l.add(m[br][i]);
                }
                br--;
            }
            if (lc <= rc) {
                for (int i = br; i >= tr; i--) {
                    l.add(m[i][lc]);
                }
                lc++;
            }
        }
        return l;
    }
}