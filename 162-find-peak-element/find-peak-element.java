class Solution {
    public int findPeakElement(int[] arr) {
        if(arr.length == 1 && arr[0] == -2147483648) return 0;
        int idx = -1;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
                idx = i;
            }
        }
        return idx;
    }
}