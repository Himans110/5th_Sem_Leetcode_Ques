class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if(arr.length == 2) return true;
        Arrays.sort(arr);
        int min = arr[1]-arr[0];
        for(int i = 2 ; i < arr.length ; i++){
            if(arr[i]-arr[i-1] != min) return false;
        }
        return true;
    }
}