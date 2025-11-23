class Solution {
    public int minimumFlips(int n) {
        String bin = Integer.toBinaryString(n);
        String rev = new StringBuilder(bin).reverse().toString();
        int ans = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) != rev.charAt(i)) {
                ans++;
            }
        }
        return ans;
    }
}