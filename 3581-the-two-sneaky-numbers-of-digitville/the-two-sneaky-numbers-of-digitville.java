class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        int arr[] = new int[2];
        int m = 0;
        for(int i : nums){
            if(h.contains(i)) arr[m++] = i;
            else h.add(i);
        }
        return arr;
    }
}