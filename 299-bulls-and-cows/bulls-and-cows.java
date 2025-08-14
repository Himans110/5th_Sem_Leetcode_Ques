class Solution {
    public String getHint(String s, String g) {
        int x = 0;
        int y = 0;
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i =0 ; i < s.length(); i++){
            if(s.charAt(i) == g.charAt(i)) x++;
            else{
                int num = s.charAt(i)-'0';
                a.put(num,a.getOrDefault(num,0)+1);
            }
        }
        for(int i = 0 ; i< g.length() ; i++){
            if(s.charAt(i) != g.charAt(i)){
                int num = g.charAt(i)-'0';
                if(a.containsKey(num) && a.get(num) > 0){
                    y++;
                    a.put(num,a.get(num)-1);
                }
            }
        }
        return x+"A"+y+"B";

    }
}