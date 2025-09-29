class Solution {
    public int numIslands(char[][] g) {
        int count = 0;
        for(int i = 0 ; i < g.length ; i++){
            for(int j = 0 ; j < g[0].length ; j++){
                if(g[i][j] == '1'){
                    find(g,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void find(char g[][] , int i , int j){
        if(i <0 || i >= g.length || j < 0 || j >= g[0].length || g[i][j] != '1') return;
        g[i][j] = '0';
        find(g , i-1 , j);
        find(g , i+1 , j);
        find(g , i , j-1);
        find(g , i , j+1);
    }

}