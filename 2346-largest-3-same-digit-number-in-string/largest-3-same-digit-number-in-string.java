class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";
        int n = Integer.MIN_VALUE;
        for(int i = 0 ; i< num.length()-2 ; i++){
            String p = num.substring(i,i+3);
            if(p.charAt(0) == p.charAt(1) && p.charAt(1) == p.charAt(2)){
                n = Math.max(n,p.charAt(0)-'0');
            }
        }
        if(n !=Integer.MIN_VALUE ) ans=n+""+n+""+n;
        return ans;
    }
}