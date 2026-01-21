class Solution {
    public int nextGreaterElement(int n) {
        String s=String.valueOf(n);
        int[]arr=new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i)-'0';
        }
        long ans= Long.parseLong(nextperm(arr));
        if(ans<=n || ans>Integer.MAX_VALUE) return -1;
        return (int)ans;
    }
    public String nextperm(int[] arr) {
        int n=arr.length;
        int idx=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            rev(arr,0,n-1);   
        }
        else{  
            int j=-1;
            for(int i=n-1;i>=0;i--){
                if(arr[i]>arr[idx]){
                    j=i;
                    break;
                }
            }
            swap(arr,idx,j);
            rev(arr,idx+1,n-1);
        }
        String ans="";
        for(int i=0;i<arr.length;i++){
            ans+=arr[i]+"";
        }
        return ans;

    }
    public static void rev(int[] arr,int n,int m) {
        int i = n;
        int j = m;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
       
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}