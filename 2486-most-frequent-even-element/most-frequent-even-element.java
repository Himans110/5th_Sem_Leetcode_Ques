class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if (i % 2 == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }
        int ans = -1;
        int maxf = 0;
        for(int i : map.keySet()){
            if(map.get(i) > maxf || (map.get(i) == maxf && i < ans)){
                ans = i;
                maxf = map.get(i);
            }
        }
        return ans;
    }
}