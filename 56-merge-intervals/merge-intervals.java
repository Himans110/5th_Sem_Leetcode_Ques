class Solution {
    public int[][] merge(int[][] arr) {
        int idx = 0;
        Arrays.sort(arr, (a,b)->(a[0]-b[0]));
        int st = arr[0][0];
        int end = arr[0][1];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i][0] <= end){
                end = Math.max(end, arr[i][1]);
            }
            else{
                arr[idx][0] = st;
                arr[idx][1] = end;
                idx++;
                st = arr[i][0];
                end = arr[i][1];
            }
        }
        arr[idx][0] = st;
        arr[idx][1] = end;
        idx++;
        int ans[][] = new int[idx][2];
        for(int i= 0 ; i < idx ; i++){
            ans[i][0] = arr[i][0];
            ans[i][1] = arr[i][1];
        }
        return ans;
    }
}