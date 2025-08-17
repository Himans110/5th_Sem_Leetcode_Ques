class Solution {
    public int xorOperation(int n, int s) {
        int arr[] = new int[n];
        int xor = 0;
        for(int i = 0 ; i < n ; i++){
            int val = s + 2 * i;
            xor ^= val;
        }
        return xor;
    }
}