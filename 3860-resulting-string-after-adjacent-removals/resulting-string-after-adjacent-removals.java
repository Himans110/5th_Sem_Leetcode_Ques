class Solution {
    public String resultingString(String s) {
        StringBuilder sb= new StringBuilder("");
        for (char c:s.toCharArray()){
            if (sb.length()==0) {
                sb.append(c);
            }
            else if ((c=='z'&&sb.charAt(sb.length()-1)=='a')||(c=='a'&&sb.charAt(sb.length()-1)=='z')) {
                sb.deleteCharAt(sb.length()-1);
            }
            else if (c==sb.charAt(sb.length()-1)+1||c==sb.charAt(sb.length()-1)-1) {
                sb.deleteCharAt(sb.length()-1);
            }
            else {
                sb.append(c);
            }
        }
   return sb.toString();
    }
}