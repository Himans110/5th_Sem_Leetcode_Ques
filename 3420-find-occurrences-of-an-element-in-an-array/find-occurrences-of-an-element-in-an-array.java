class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] q, int x) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == x) l.add(i);
        }
        int ans[] = new int[q.length];
        int m = 0;
        for(int i : q){
            if(i > l.size()) ans[m++] = -1;
            else{
                ans[m++] = l.get(i-1);
            }
        }
        return ans;
    }
}