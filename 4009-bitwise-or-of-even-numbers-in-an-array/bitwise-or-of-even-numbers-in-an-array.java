class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int aur = 0;
        for(int i : nums){
            if(i % 2 == 0){
                aur |= i;
            }
        }
        return aur;
    }
}