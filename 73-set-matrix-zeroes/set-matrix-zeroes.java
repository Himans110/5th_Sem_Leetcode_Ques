class Solution {
    public void setZeroes(int[][] m) {
        boolean []r = new boolean [m.length];
        boolean []c = new boolean [m[0].length];
        for(int i = 0 ; i < m.length ; i++){
            for(int j = 0 ; j < m[0].length ; j++){
                if(m[i][j] == 0){
                    r[i] = true;
                    c[j] = true;
                }
            }
        }
        for(int i = 0 ; i < m.length ; i++){
            if(r[i] == true){
                for(int j = 0 ; j  < m[0].length ; j++){
                    m[i][j] = 0;
                }
            }
        }
        for(int j = 0 ; j < m[0].length ; j++){
            if(c[j] == true){
                for(int i = 0 ; i  < m.length ; i++){
                    m[i][j] = 0;
                }
            }
        }

    }
}