class Solution {
    public int findPeakElement(int[] arr) {
        int start=1;
        int end=arr.length-2;
        int n=arr.length;
        if(n==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]<arr[mid+1]) start=mid+1;
            else end=mid-1;
        }
        return -1;
    }
}