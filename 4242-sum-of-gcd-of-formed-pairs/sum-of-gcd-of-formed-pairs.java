class Solution {
    public long gcdSum(int[] nums) {
        int maxa[] = new int[nums.length];
        maxa[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            maxa[i] = Math.max(nums[i],maxa[i-1]);
        }
        int pgcd[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            pgcd[i] = gcd(nums[i],maxa[i]);
        }
        Arrays.sort(pgcd);
        long sum = 0;
        int i = 0, j = pgcd.length-1;
        while(i < j){
            sum += gcd(pgcd[i],pgcd[j]);
            i++;
            j--;
        }
        return sum;
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}