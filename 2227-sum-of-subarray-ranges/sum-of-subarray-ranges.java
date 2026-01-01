class Solution {
      public static int[] FindPSE(int nums[]){
        int n=nums.length;
        Stack<Integer> st=new Stack();
        int pse[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]>nums[i]){
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
      public static int[] FindNSE(int nums[]){
        int n=nums.length;
        Stack<Integer> st=new Stack();
        int nse[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=n;
            }
            else{
                nse[i]=st.peek();
            }
             st.push(i);
        }
        return nse;
    }
      public static int[] FindPGE(int nums[]){
        int n=nums.length;
        Stack<Integer> st=new Stack();
        int pge[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pge[i]=-1;
            }
            else{
                pge[i]=st.peek();
            }
             st.push(i);
        }
        return pge;
    }
    public static int[] FindNGE(int nums[]){
        int n=nums.length;
        Stack<Integer> st=new Stack();
        int nge[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i]=n;
            }
            else{
                nge[i]=st.peek();
            }
             st.push(i);
        }
        return nge;
    }
    public static long min(int nums[]){
        int nse[]=FindNSE(nums);
        int pse[]=FindPSE(nums);
        long total=0;
        for(int i=0;i<nums.length;i++){
            int left=i-pse[i];
            int right=nse[i]-i;
            total+=(long)left*right*nums[i];
        
        }
        return total;
    }
     public static long max(int nums[]){
        int nge[]=FindNGE(nums);
        int pge[]=FindPGE(nums);
        long total=0;
        for(int i=0;i<nums.length;i++){
            int left=i-pge[i];
            int right=nge[i]-i;
            total+=(long)left*right*nums[i];
        
        }
        return total;
    }
    public long subArrayRanges(int[] nums) {
        long maxi=max(nums);
        long mini=min(nums);
        return maxi-mini;
        
    }
}