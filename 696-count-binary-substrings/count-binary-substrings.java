class Solution {
    public int countBinarySubstrings(String s) {
        int zero = 0;
        int one = 0;
        int ans = 0;
        if(s.charAt(0) == '0') zero++;
        else one++;
        for(int i = 1; i < s.length() ; i++){
            if(s.charAt(i) == s.charAt(i-1)){
                if(s.charAt(i) == '0') zero++;
                else one++;
            }
            else{
                ans+= Math.min(zero,one);
                if(s.charAt(i)=='0') zero=1;
                else one = 1;
            }
        }
        ans+= Math.min(zero,one);
        return ans;
    }
}