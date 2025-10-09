class Solution {
    public int lengthOfLIS(int[] arr) {
       int lis[] = new int[arr.length];
       Arrays.fill(lis, 1);
       for(int i = 1 ; i < lis.length ; i++){
        for(int j = i-1 ; j>= 0 ; j--){
            if(arr[i] > arr[j]){
                int l = lis[j];
                lis[i] = Math.max(lis[i],1+l);
            }
        }
       }
       int max = lis[0];
       for(int i = 1 ; i < lis.length ; i++){
        max = Math.max(max,lis[i]);
       }
       return max;
    }
}