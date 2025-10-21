class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum =  0;
        for(int i = 1 ; i < points.length ; i++){
            int d1 = Math.abs(points[i][0]-points[i-1][0]);
            int d2 = Math.abs(points[i][1] - points[i-1][1]);
            sum += Math.max(d1,d2);
        }
        return sum;
    }
}