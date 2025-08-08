class Solution {
    public int countHillValley(int[] arr) {
        int count = 0;
        for(int i = 1 ; i < arr.length-1 ; i++){
            if (arr[i] == arr[i - 1]) continue;
            int left = i - 1;
            int right = i + 1;
            while (right < arr.length && arr[right] == arr[i]) right++;
            if (right < arr.length) {
                if (arr[i] > arr[left] && arr[i] > arr[right]) count++; 
                else if (arr[i] < arr[left] && arr[i] < arr[right]) count++; 
            }
        }
        return count;
    }
}