class Solution {
    public int maximalRectangle(char[][] m) {
        int []h = new int[m[0].length];
        int ans = 0;
        for(int i = 0 ; i < m.length ; i++){
            for(int j = 0 ; j < m[0].length ; j++){
                if(m[i][j] == '1'){
                    h[j]+=1;
                }
                else{
                    h[j] = 0;
                }
            }
            ans = Math.max(ans,max(h));
        }
        return ans;
    }
    public int max(int[] arr) {
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