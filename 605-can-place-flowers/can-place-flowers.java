class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                int left = (i == 0) ? 0 : arr[i-1];
                int right = (i == arr.length-1) ? 0 : arr[i+1];
                if(left == 0 && right == 0){
                    count++;
                    arr[i] = 1;
                }
            }
        }
        return count>=n;
    }
}