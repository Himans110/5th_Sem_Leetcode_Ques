class Solution {
    public int findMaxK(int[] arr) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        
        while (i < j) {
            if (Math.abs(arr[i]) == arr[j]) {
                if (arr[j] == -arr[i]) return arr[j];
                i++;
                j--;
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
