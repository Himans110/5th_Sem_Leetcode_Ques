class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int pre[] = new int[n]; // nse -> r
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < arr.length ; i++){
            while(!st.isEmpty() && arr[i] < arr[st.peek()]){
                pre[st.pop()] = i;
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            pre[st.pop()] = n;
        }
        int []suf = new int[n]; // nse -> l
        for(int i = n-1 ; i >= 0 ; i--){
            while(!st.isEmpty() && arr[i] < arr[st.peek()]){
                suf[st.pop()] = i;
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            suf[st.pop()] = -1;
        }
        int ans = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            int w = pre[i]-suf[i]-1;
            ans = Math.max(ans,w*arr[i]);
        }
        return ans;
    }
}