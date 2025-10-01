class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> l = new ArrayList<>();
        for(String i : bank){
            int count = 0;
            for(char j : i.toCharArray()){
                if(j == '1') count++;
            }
            if(count>0) l.add(count);
        }
        int ans = 0;
        for(int i = 0 ; i < l.size()-1 ; i++){
            ans += (l.get(i)*l.get(i+1));
        }
        return ans;
    }
}