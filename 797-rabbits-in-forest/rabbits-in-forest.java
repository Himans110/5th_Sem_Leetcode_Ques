class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:answers){
            map.put(i,map.getOrDefault(i,0)+1);  
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int x=e.getKey()+1;
            int group=(int)Math.ceil((double)e.getValue()/x);
            ans+=group*x;

        }
        return ans;
    }
}