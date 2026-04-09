class Solution {
    public int singleNumber(int[] arr) {
        int ans  = -1;
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i : arr){
            a.put(i,a.getOrDefault(i,0)+1);
        }
        for(var e : a.entrySet()){
            if(e.getValue() == 1) ans = e.getKey();
        }
        return ans;
    }
}