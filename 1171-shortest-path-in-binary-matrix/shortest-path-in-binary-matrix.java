class Solution {
    int r[] = {0,0,1,-1, 1, 1, -1 ,-1};
    int c[] = {1,-1,0,0 ,-1 ,1 ,1 , -1};
    public int shortestPathBinaryMatrix(int[][] arr) {
        if (arr[0][0] == 1 || arr[arr.length-1][arr.length-1] == 1) return -1;
        Queue<int []> q = new LinkedList<>();
        q.add(new int[]{0 , 0 , 1});
        arr[0][0] = 1;
        while(!q.isEmpty()){
            int cur[] = q.poll();
            int cr = cur[0], cc = cur[1] , dis = cur[2];
            if(cr == arr.length-1 && cc == arr.length-1) return dis;
            for(int i = 0; i <= 7 ; i++){
                int nr = cr+r[i], nc = cc+c[i];
                if(nr >= 0 && nc >= 0 && nr <arr.length && nc < arr.length && arr[nr][nc] == 0){
                    arr[nr][nc] = 1;
                    q.add(new int[]{nr,nc,dis+1});
                }
            }
        }
        return -1;
    }
}