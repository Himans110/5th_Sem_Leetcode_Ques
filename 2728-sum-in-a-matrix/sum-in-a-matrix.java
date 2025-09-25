class Solution {
    public int matrixSum(int[][] nums) {
         for (int[] row : nums) {
            Arrays.sort(row); 
            reverse(row); 
        }
        int sum  = 0;
        for(int i = 0 ; i < nums[0].length ; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0 ; j < nums.length ; j++){
                max = Math.max(max,nums[j][i]);
            }
            sum += max;
        }
        return sum;
    }
    private static void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}