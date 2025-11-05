class Solution {
    public int findMaxK(int[] arr) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        
        while (i < j) {
            if(arr[i] > 0) break;
            if (Math.abs(arr[i]) == arr[j]) {
                return arr[j];
            } 
            else if (Math.abs(arr[i]) > arr[j]) {
                i++;
            } 
            else {
                j--;
            }
        }
        return -1;
    }
}
