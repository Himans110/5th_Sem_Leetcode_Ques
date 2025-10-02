class Solution {
    public int maximumSwap(int num) {
        String s = String.valueOf(num);
        char[] arr = s.toCharArray();
        int n = arr.length;
        //last occurrence of each digit (0-9)
        int[] last = new int[10];
        for (int i = 0; i < n; i++) {
            last[arr[i] - '0'] = i;
        }
        for (int i = 0; i < n; i++) {
            // Check if we can find a larger digit to swap
            for (int d = 9; d > arr[i] - '0'; d--) {
                if (last[d] > i) {
                    char temp = arr[i];
                    arr[i] = arr[last[d]];
                    arr[last[d]] = temp;
                    return Integer.parseInt(new String(arr));
                }
            }
        }
        return num;
    }
}