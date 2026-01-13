class Solution {
    int r[]= {1,-1,0,0};
    int c[] = {0,0,1,-1};
    public int minimumEffortPath(int[][] arr) {
        
        int dis[][] = new int[arr.length][arr[0].length];
        for(int d[] : dis){
            Arrays.fill(d,Integer.MAX_VALUE);
        }
        dis[0][0] = 0;

        PriorityQueue<int []> pq = new PriorityQueue<>((a,b)-> a[2]-b[2]);
        pq.add(new int[]{0,0,0});

        while(!pq.isEmpty()){
            int cur[] = pq.poll();
            int cr = cur[0], cc = cur[1],  effort= cur[2];
            if(cr == arr.length-1 && cc == arr[0].length-1) return effort;
            for(int i = 0 ;i < 4 ; i++){
                int nr = cr+r[i], nc = cc+c[i];
                if(nr >= 0 && nc >= 0 && nr < arr.length && nc < arr[0].length){
                    int neweffort = Math.max(effort,Math.abs(arr[nr][nc]-arr[cr][cc]));
                    if(neweffort < dis[nr][nc]){
                        dis[nr][nc] = neweffort;
                        pq.add(new int[]{nr, nc , neweffort});
                    }
                }
            }
        }
        return 0;
    }
}