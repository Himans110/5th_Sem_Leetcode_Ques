class Solution {
    public int countNicePairs(int[] nums) {
        int mod = 1000000007;
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            int key = num - rev(num);
            count = (count + freq.getOrDefault(key, 0)) % mod;
            freq.put(key, freq.getOrDefault(key, 0) + 1);
        }
        return count;

    }
    private static int rev(int num) {
        int r = 0;
        while (num != 0) {
            r = r * 10 + num % 10;
            num /= 10;
        }
        return r;
    }
}