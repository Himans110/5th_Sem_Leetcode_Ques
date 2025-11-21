class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        if (n < 3) return 0;
        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int l = i - 1;
                while (l > 0 && arr[l] > arr[l - 1]) l--;
                int r = i + 1;
                while (r < n - 1 && arr[r] > arr[r + 1]) r++;
                ans = Math.max(ans, r - l + 1);
            }
        }
        return ans;
    }
}