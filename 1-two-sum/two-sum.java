class Solution {
    public int[] twoSum(int[] arr, int target) {
        int arr1[] = {-1};
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            int find = target - arr[i];
            if(!mp.containsKey(find)){
                mp.put(arr[i],i);
            }
            else{
                arr1 = new int[]{i,mp.get(find)};
            }
        }
        return arr1;
    }
}