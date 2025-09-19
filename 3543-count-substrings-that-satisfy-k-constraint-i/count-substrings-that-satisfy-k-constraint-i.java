class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int c1 = 0, c0 = 0, c = 0;
        int si = 0;
        int ei = 0;
        while(ei < s.length()){
            if(s.charAt(ei) == '1') c1++;
            else c0++;
            while(c1 > k && c0 > k){
                char ch = s.charAt(si);
                if(ch == '1') c1--;
                else c0--;
                si++;
            }
            c += ei-si+1;
            ei++;
        }
        return c;
    }
}