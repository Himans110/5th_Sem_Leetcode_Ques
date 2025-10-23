class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length() !=2){
            String ans = "";
            for(int i = 0 ; i < s.length()-1 ; i++){
                ans += ((s.charAt(i)-'0')+(s.charAt(i+1)-'0'))%10;
            }
            s = ans;
        }
        if(s.charAt(0) == s.charAt(1)) return true;
        return false;
    }
}