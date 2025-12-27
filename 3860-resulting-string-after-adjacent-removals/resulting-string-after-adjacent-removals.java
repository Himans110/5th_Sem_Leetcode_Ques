class Solution {
    public String resultingString(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && check(st.peek(), c)) {
                st.pop();   
            } else {
                st.push(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }

    private boolean check(char a, char b) {
        if (Math.abs(a - b) == 1) return true;
        return (a == 'a' && b == 'z') || (a == 'z' && b == 'a');
    }
}
