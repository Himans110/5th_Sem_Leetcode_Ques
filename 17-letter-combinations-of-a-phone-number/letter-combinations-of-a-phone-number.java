class Solution {
    static String key[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String ques) {
        List<String> a = new ArrayList<>();
        if(ques.length() == 0) return a;
        print(ques,"",a);
        return a;
    }
    public static void print(String ques, String ans,List<String> a){
        if(ques.length() == 0){
            a.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        String m = key[ch-'0'];
        for(int i = 0 ; i < m.length() ; i++){
            print(ques.substring(1), ans+m.charAt(i), a);
        }
    }
}