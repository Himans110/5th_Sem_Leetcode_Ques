class Solution {
    public int minOperations(String s) {
        boolean flag = true;
        int min = 0;
        for(int i = 0 ; i< s.length() ; i++){
            if(s.charAt(i) != 'a'){
                min = Math.max(min,(26-((int)s.charAt(i) - (int)'a') % 26));
                flag = false;
            }
        }
        if(flag)  return 0;
        return min;
    }
}