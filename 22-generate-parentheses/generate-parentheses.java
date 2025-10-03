class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        fun(n , 0 ,0 , "" , ans);
        return ans;
    }
    public void fun(int n , int op , int cl , String s , List<String> ans){
        if(op == n && cl == n){
            ans.add(s);
            return;
        }
        if(op > n || cl > op) return;
        fun(n , op+1, cl , s+"(" , ans);
        fun(n , op, cl+1 , s +")" , ans);
    }
}