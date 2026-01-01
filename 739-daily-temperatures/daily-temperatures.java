class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int arr[] = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < nums.length ; i++){
            while(!st.isEmpty() && nums[i] > nums[st.peek()]){
                int idx = st.peek();
                arr[st.pop()] = i-idx;
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            arr[st.pop()] = 0;
        }
        return arr;
    }
}