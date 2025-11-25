class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0, mul = 1;
        int num = n;
        while(n > 0){
            int rem = n % 10;
            sum += rem;
            mul *= rem;
            n = n / 10;
        }
        int value = sum + mul;
        return num % value == 0;
    }
}