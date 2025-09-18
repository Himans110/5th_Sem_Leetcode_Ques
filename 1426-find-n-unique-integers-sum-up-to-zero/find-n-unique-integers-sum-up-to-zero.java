class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int num = 1;
        int i = 0;
        while (i < n-1) {
            arr[i] = num;
            arr[i + 1] = -num;
            num++;
            i += 2;
        }
        if (n % 2 != 0) {
            arr[n - 1] = 0;
        }

        return arr;
    }
}