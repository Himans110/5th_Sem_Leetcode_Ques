class Solution {
    public List<List<Integer>> groupThePeople(int[] gs) {
        List<List<Integer>> ans = new ArrayList<>();
        TreeSet<Integer> h = new TreeSet<>();
        for(int i : gs){
            h.add(i);
        }
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i : h){
            map.put(i,new ArrayList<>());
        }
        for(int i = 0 ; i < gs.length ; i++){
            int key = gs[i];
            List<Integer> temp = map.get(key);
            temp.add(i);
            map.put(key,temp);
        }
        for(int i : map.keySet()){
            if(i == map.get(i).size()) ans.add(map.get(i));
            else{
                int size = map.get(i).size()/i;
                int k = 0;
                while(size-- > 0){
                    List<Integer> l = new ArrayList<>();
                    for(int c = 0 ; c< i ; c++){
                        l.add(map.get(i).get(k++));
                    }
                    ans.add(l);
                }
            }
        }
        return ans;

    }
}