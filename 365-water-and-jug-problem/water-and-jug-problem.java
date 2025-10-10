class Solution {
    public boolean canMeasureWater(int x, int y, int t) {
        if(x+y == t) return true;
        else if(x+y < t) return false;
        else{
            return t%gcd(x,y) == 0;
        }
    }
    public int gcd(int a , int b){
        int ans =0;
        for(int i =1 ; i <= Math.min(a,b) ; i++){
            if(a%i == 0 && b % i == 0) ans = i;
        }
        return ans;
    }
}