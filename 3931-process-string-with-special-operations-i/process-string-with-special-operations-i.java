class Solution {
    public String processStr(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i =0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '#'){
                ans.append(ans);
            }
            else if(ch == '%'){
                ans = ans.reverse();
            }
            else if(ch == '*'){
                if(ans.length()>=1)ans.deleteCharAt(ans.length()-1);
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}