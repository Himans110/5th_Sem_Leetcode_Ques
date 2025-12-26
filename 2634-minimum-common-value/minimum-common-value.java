class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> a = new HashSet<>();
        for(int i = 0 ; i < nums1.length ; i++){ a.add(nums1[i]);}
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums2.length ; i++){
            if(a.contains(nums2[i])){
                ans = Math.min(ans,nums2[i]);
            }
        }
        if(ans != Integer.MAX_VALUE) return ans;
        else return -1;
    }
}