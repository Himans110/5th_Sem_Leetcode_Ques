class Solution {
    public int maxPower(String s) {
        if(s.length() == 1) return 1;
        int max = 1;
        int count = 1;
        for(int i = 0 ; i < s.length()-1 ; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }
            else{
                count = 1;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}