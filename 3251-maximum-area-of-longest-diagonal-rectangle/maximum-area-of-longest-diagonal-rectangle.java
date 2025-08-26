class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        double max = 0;
        int area = 0;
        for(int i = 0 ; i< d.length ; i++){
            int l = d[i][0];
            int w = d[i][1];
            double dl = Math.sqrt(Math.pow(l,2)+Math.pow(w,2));
            if(dl > max){
                max = dl;
                area = l*w;
            }
            else if(dl == max){
                area = Math.max(area,l*w);
            }
        }
        return area;
    }
}