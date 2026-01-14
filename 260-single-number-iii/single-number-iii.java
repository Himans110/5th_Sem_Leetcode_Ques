class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int i : nums){
            xor ^= i;
        }
        int mask = (xor&(-1 * xor)); // piche se pahla 1 kah hai;
        int a = 0;
        for(int i : nums){
            if((mask & i) != 0){
                a ^= i;
            }
        }
        int b = xor ^ a;
        return new int[] {a,b};
    }
}