class Solution {
    public String getHappyString(int n, int k) {
        List<String> l = new ArrayList<>();
        fun("abc", 0 , l, n, "");
        Collections.sort(l);
        if(k > l.size()) return "";
        return l.get(k-1);
    }
    public void fun(String s , int j , List<String> l , int n , String ans){
        if(ans.length() == n){
            l.add(ans);
            return;
        }
        if(ans.length() > n) return;
        for(int i = 0 ; i < s.length() ; i++){
            if (ans.isEmpty()) {
                fun(s, i, l, n, ans + s.charAt(i));
            } else {
                if (s.charAt(i) != ans.charAt(ans.length() - 1)) {
                    fun(s, i, l, n, ans + s.charAt(i));
                }
            }
        }
    }
}