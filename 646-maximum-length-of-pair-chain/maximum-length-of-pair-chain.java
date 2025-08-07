class Solution {
    public int findLongestChain(int[][] arr) {
        Arrays.sort(arr,(a,b)-> Integer.compare(a[1],b[1]));
        int count = 1;
        int prev = arr[0][1];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i][0] > prev){
                count++;
                prev = arr[i][1];
            }
        }
        return count;
    }
}