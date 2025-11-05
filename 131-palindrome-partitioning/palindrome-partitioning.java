class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> l = new ArrayList<>();
        fun(s,ans, l);
        return ans;
    }
    public void fun(String ques, List<List<String>> ans , List<String> l ){
        if(ques.length() == 0){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i = 1 ; i <= ques.length() ; i++){
            String m = ques.substring(0,i);
            if(ispal(m)){
                l.add(m);
                fun(ques.substring(i), ans, l);
                l.remove(l.size()-1);
            }
        }
    }
    public boolean ispal(String s){
        int i =0 , j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}