class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1; j < nums.length ; j++){
                int mul = nums[i]*nums[j];
                map.put(mul,map.getOrDefault(mul,0)+1);
            }
        }
        int ans = 0;
        for(int i : map.keySet()){
            int freq = map.get(i);
            if(freq > 1){
                ans += freq * (freq - 1) * 4;
            }
        }
        return ans;
    }
}