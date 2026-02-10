class Solution {
    public int longestBalanced(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            int co = 0, ce = 0;
            HashSet<Integer> h = new HashSet<>();
            for(int j = i; j < nums.length; j++){
                int val=nums[j];
                if(val % 2 == 0 && !h.contains(val)) ce++;
                else if (val % 2 == 1 && !h.contains(val)) co++;
                h.add(nums[j]);
                if(co == ce){
                    ans = Math.max(ans ,j-i+1);
                }
            } 
        }
        return ans;
    }
}