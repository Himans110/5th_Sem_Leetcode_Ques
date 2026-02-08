class Solution {
    public int totalSteps(int[] nums) {
        int n = nums.length;
        int ans  = 0;
        Stack<int []> st = new Stack<>();
        st.push(new int[]{nums[n-1], 0});
        for(int i = n-2 ; i >= 0 ; i--){
            int count = 0;
            while(!st.isEmpty() && nums[i] > st.peek()[0]){
                count = Math.max(count+1, st.peek()[1]);
                st.pop();
            }
            ans = Math.max(ans, count);
            st.push(new int[]{nums[i], count});
        }
        return ans;
    }
}