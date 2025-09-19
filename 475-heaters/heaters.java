class Solution {
    public int findRadius(int[] ho, int[] he) {
        Arrays.sort(ho); 
        Arrays.sort(he); 
        int low = 0;
        int high = Math.max(ho[ho.length - 1], he[he.length - 1]);
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(ho, he, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1; 
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] ho, int[] he, int mid) {
        int j = 0;
        for (int i = 0; i < ho.length; i++) {
            while (j < he.length && (ho[i] < he[j] - mid || ho[i] > he[j] + mid)) {
                j++;
            }
            if (j == he.length) return false;
        }
        return true;
    }
}
