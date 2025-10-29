class Solution {
    public int smallestNumber(int n) {
        for(int i = n ; i<=100000 ; i++){
            if(set(i)) return i;
        }
        return -1;
    }
    public boolean set(int n){
        while(n>0){
            int rem = n % 2;
            if(rem == 0) return false;
            n /= 2;
        }
        return true;
    }
}