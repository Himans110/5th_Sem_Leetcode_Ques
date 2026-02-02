/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> l = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            l.add(curr.val);
            curr = curr.next;
        }
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < l.size() ; i++){
            while(!st.isEmpty() &&  l.get(i) > l.get(st.peek())){
                l.set(st.pop(), l.get(i)); 
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            l.set(st.pop() , 0);
        }
        int ans[] = new int[l.size()];
        int j = 0;
        for(int i : l){
            ans[j++] = i;
        }
        return ans;
    }
}