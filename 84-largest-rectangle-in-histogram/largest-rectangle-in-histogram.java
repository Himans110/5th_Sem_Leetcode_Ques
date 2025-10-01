class Solution {
    public int largestRectangleArea(int[] arr) {
        // optimized approach

        int area = 0;
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ;i <= n ; i++){
            int val = (i == n) ? 0 : arr[i];
            while(!st.isEmpty() && val < arr[st.peek()]){
                int nsr = i;
                int prob = st.pop(); // to be solve problem
                int nsl = st.isEmpty() ? -1 : st.peek();
                int w = nsr-nsl-1;
                area = Math.max(area, w*arr[prob]);
            }
            st.push(i);
        }
        return area;
    }
}