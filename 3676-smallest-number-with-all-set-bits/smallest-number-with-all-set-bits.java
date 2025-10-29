class Solution {
    public int smallestNumber(int n) {
        int num = set(n);
        int ans = (int)Math.pow(2,num)-1;
        return ans;
    }
    public int set(int n){
        int count = 0;
        while(n>0){
            int rem = n % 2;
            count++;
            n /= 2;
        }
        return count;
    }
}