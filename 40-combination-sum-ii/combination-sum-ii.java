class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        fun(arr, target, ans , l, 0);
        return ans;
    }
    public void fun(int arr[] , int target, List<List<Integer>> ans , List<Integer> l, int idx){
        if(target == 0){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i = idx ; i < arr.length ; i++){
            if (i > idx && arr[i] == arr[i - 1]) continue;
            if(arr[i] <= target){
                l.add(arr[i]);
                fun(arr, target-arr[i], ans, l, i+1);
                l.remove(l.size()-1);
            }
        }
    }
}