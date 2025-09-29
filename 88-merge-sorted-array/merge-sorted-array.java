class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        int ans[] = new int[m+n];
        int p = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                ans[p++] = nums1[i];
                i++;
            }
            else if(nums1[i] > nums2[j]){
                ans[p++] = nums2[j];
                j++;
            }
            else{
                ans[p++] = nums1[i];
                ans[p++] = nums2[j];
                i++;
                j++;
            }
        }
        while(i < m){
            ans[p++] = nums1[i];
            i++;
        }
        while(j < n){
            ans[p++] = nums2[j];
            j++;
        }
        for(int k = 0 ; k < nums1.length ; k++){
            nums1[k] = ans[k];
        }
    }
}