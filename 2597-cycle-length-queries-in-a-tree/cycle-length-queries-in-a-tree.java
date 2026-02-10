class Solution {
    public int[] cycleLengthQueries(int n, int[][] arr) {
        int ans[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int a = arr[i][0], b = arr[i][1];
            ans[i] = solve(a,b);
        }
        return ans;
    }
    public int solve(int a , int b){
        int count = 0;
        while(a != b){
            if(a > b){
                a /= 2;
            }
            else if(b > a){
                b /= 2;
            }
            count++;
        }
        return count+1;
    }
}