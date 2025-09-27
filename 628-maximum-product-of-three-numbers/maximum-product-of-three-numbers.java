class Solution {
    public int maximumProduct(int[] arr) {
        Arrays.sort(arr);
        int ans1 = arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3];
        int ans2 = arr[0]*arr[1]*arr[arr.length-1];
        return Math.max(ans1,ans2);
    }
}