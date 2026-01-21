class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int xor1 = find(arr1);
        int xor2 = find(arr2);
        return xor1&xor2;
    }
    public int find(int []nums){
        int xor = 0; 
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }
}