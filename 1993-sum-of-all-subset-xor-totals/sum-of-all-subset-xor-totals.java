class Solution {
    public int subsetXORSum(int[] arr) {
        List<List<Integer>> a = new ArrayList<>();
        List<Integer> a1 = new ArrayList<>();
        subset(arr,0,a1,a);
        int sum = 0;
        for(int i = 0 ; i < a.size() ; i++){
            sum += find(a.get(i));
        }
        return sum;
    }
    public static void subset(int nums[],int start,List<Integer> a1,List<List<Integer>> a){
        a.add(new ArrayList<>(a1));
        for (int i = start; i < nums.length; i++){
            a1.add(nums[i]);
            subset(nums, i + 1, a1, a);
            a1.remove(a1.size() - 1);
        }
    }
    public int find(List<Integer> a){
        int xor = 0;
        for (Integer num : a) {
            xor ^= num;  
        }
        return xor;
    }
}