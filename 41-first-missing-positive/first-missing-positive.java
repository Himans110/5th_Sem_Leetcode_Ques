class Solution {
    public int firstMissingPositive(int[] arr){
       boolean flag = false;
       for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 1) flag = true;
            if(arr[i] < 1 || arr[i] > arr.length ) arr[i] = 1;
       }
       if(!flag) return 1;
       for(int i = 0 ; i < arr.length ; i++){
            int idx = Math.abs(arr[i]);
            if(arr[idx-1] > 0 ) arr[idx-1] *= -1;
       }
       for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] > 0){
                return i+1;
            }
       }
       return arr.length+1;
    }
}