class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] arr = new int[queries.length];
        for(int q=0; q<queries.length; q++){
                int qx = queries[q][0];
                int qy = queries[q][1];
                int r = queries[q][2];
                int count = 0;
            for(int i = 0; i<points.length; i++ ){
                int px = points[i][0];
                int py = points[i][1];
                if(Math.pow((px-qx),2) + Math.pow((py-qy),2) <= r * r){
                        count++;
                }
            }
            arr[q] = count;
        }
        return arr;
    }
}