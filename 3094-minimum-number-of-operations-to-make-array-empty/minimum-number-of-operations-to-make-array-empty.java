class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i :  nums){
            map.put(i , map.getOrDefault(i,0)+1);
        }
        int count = 0;
        for (int freq : map.values()) {
            if (freq == 1) return -1;
            int ops = freq / 3;
            int rem = freq % 3;
            if (rem == 0) {
                count += ops;
            } else if (rem == 1) {
                if (ops >= 1) {
                    ops -= 1;
                    count += ops + 2;
                } else {
                    return -1;
                }
            } else if (rem == 2) {
                count += ops + 1;
            }
        }
        return count;
    }
}