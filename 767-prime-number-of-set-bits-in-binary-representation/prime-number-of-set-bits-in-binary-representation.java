class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left ; i<= right ; i++){
            int bits = Integer.bitCount(i);
            if(is_prime(bits)) count++;
        }
        return count;
    }
    public static boolean is_prime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}