class Solution {
    public int removeCoveredIntervals(int[][] arr) {
        Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            } else {
                return a[0] - b[0];
            }
        });
        int st = arr[0][0];
        int end = arr[0][1];
        int count = 0;
        for(int i = 1 ; i < arr.length ; i++){
            if( st <= arr[i][0] &&  arr[i][1] <= end){
                count++;
            }
            else{
                st = arr[i][0];
                end = arr[i][1];
            }
        }
        return arr.length - count;
    }
}