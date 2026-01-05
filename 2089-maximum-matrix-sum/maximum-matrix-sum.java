class Solution {
    public long maxMatrixSum(int[][] arr) {
        int n = arr.length;
        long sum = 0;
        int min = Integer.MAX_VALUE;
        int neg = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = arr[i][j];
                sum += Math.abs(val);
                if (val < 0) {
                    neg++;
                }
                min = Math.min(min, Math.abs(val));
            }
        }
        if (neg % 2 == 0) {
            return sum;
        }
        return sum - 2 * min;
    }
}