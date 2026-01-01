class Solution {
    public static int[] findpse(int arr[]){
        Stack<Integer> st=new Stack<>();
        int pse[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }
            else{
                pse[i]=st.peek();
            }
            st.push(i);
        }
        return pse;
    }
    public static int[] findnse(int arr[]){
        Stack<Integer> st=new Stack<>();
        int nse[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=arr.length;
            }
            else{
                nse[i]=st.peek();
            }
            st.push(i);
        }
        return nse;
    }
    public int sumSubarrayMins(int[] arr) {
        int mod = 1000000007;
        int n=arr.length;
        int nse[]=findnse(arr);
        int pse[]=findpse(arr);
        long total=0;
        for(int i=0;i<n;i++){
            int left=i-pse[i];
            int right=nse[i]-i;
            long count=(left*right)%mod;
            count=(count*arr[i])%mod;
            total=(total+count)%mod;
        }
        return (int)total;
    }
}