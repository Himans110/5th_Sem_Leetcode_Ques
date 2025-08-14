class Solution {
    public int[] decrypt(int[] arr, int k) {
        int n = arr.length;
        int[] arr1 = new int[n];
        int p = Math.abs(k);
        if (k == 0) {
            return arr1;
        }
        else if (k > 0) {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 1; j <= p; j++) {
                    sum += arr[(i + j) % n];
                }
                arr1[i] = sum;
            }
        }
        else {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 1; j <= p; j++) {
                    sum += arr[(i - j + n) % n];
                }
                arr1[i] = sum;
            }
        }
        return arr1;
    }
}
