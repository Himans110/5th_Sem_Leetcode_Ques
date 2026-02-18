class Solution {
    public boolean hasAlternatingBits(int n) {
        String s = "";
        while(n > 0){
            int rem = n % 2;
            s+=rem;
            n = n/2;
        }
        for(int i = 1 ; i < s.length() ; i++){
            if(s.charAt(i-1) == s.charAt(i)) return false;
        }
        return true;
    }
}