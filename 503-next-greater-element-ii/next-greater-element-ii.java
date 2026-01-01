class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int arr[] = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < 2* nums.length ; i++){
            while(!st.isEmpty() && nums[i % nums.length] > nums[st.peek()]){
                arr[st.pop()] = nums[i % nums.length];
            }
            if(i < nums.length) st.push(i);
        }
        while(!st.isEmpty()){
            arr[st.pop()] = -1;
        }
        return arr;
    }
}