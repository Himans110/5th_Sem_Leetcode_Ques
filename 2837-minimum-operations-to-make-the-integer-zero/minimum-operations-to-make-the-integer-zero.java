class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for (int t = 1; t <= 60; t++) {
            long val = (long)num1 - (long)t * num2;
            if (val < 0) return -1;
            int ones = Long.bitCount(val);
            if (ones <= t && t <= val) {
                return t;
            }
        }
        return -1;
    }
}