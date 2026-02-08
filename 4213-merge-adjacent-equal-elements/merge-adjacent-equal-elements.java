class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> st = new Stack<>();
        for (int i : nums) {
            long val = i;
            while (!st.isEmpty() && st.peek() == val) {
                st.pop();
                val = val * 2;
            }
            st.push(val);
        }
        List<Long> ans = new ArrayList<>();
        while (!st.isEmpty()) {
            ans.add(st.pop());
        }
        Collections.reverse(ans);
        return ans;
    }
}
