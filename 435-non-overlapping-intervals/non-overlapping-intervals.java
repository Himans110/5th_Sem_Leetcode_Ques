class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        Arrays.sort(arr,(a,b)-> a[1]-b[1]);
        int count = 0;
        int prend = arr[0][1];
        for(int i = 1 ; i< arr.length ; i++){
            if(arr[i][0] < prend){
                count++;
            }
            else{
                prend = arr[i][1];
            }
        }
        return count;
    }
}