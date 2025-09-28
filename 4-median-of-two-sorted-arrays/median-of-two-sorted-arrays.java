class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k = 0;
        int arr[] = new int[nums1.length + nums2.length];
        for(int i = 0 ; i< nums1.length ; i++){
            arr[k++] = nums1[i];
        }
        for(int i = 0 ; i< nums2.length ; i++){
            arr[k++] = nums2[i];
        }
        Arrays.sort(arr);
        if(arr.length % 2!=0){
            int idx = arr.length / 2;
            double d = arr[idx];
            return d;
        }
        else{
            int idx1 = (arr.length/2) -1;
            int idx2 = arr.length/2;
            double ans = (arr[idx1]+arr[idx2]) / 2.0;
            return ans;
        }
    }
}