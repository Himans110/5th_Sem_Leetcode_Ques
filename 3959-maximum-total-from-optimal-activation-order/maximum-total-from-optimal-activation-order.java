class Solution {
    public long maxTotal(int[] value, int[] limit) {
        int n = value.length;
        int arr[][] = new int[n][2];
        long ans = 0;
        for(int i =  0 ; i < n; i++){
            arr[i][0] = limit[i];
            arr[i][1] = value[i];
        }
        Arrays.sort(arr, (a,b)-> (a[0] == b[0]) ? b[1]-a[1] : a[0]-b[0]);
        int i = 0;
        while (i < n) {
            int l = arr[i][0];
            int x = l;
            while (i < n && arr[i][0] == l && x > 0) {
                ans += arr[i][1];
                i++;
                x--;
            }
            while (i < n && arr[i][0] == l) {
                i++;
            }
        }
        return ans;
    }
}