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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        List<Integer> l = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            l.add(temp.val);
            temp = temp.next;
        }
        int n = l.size();
        if (n == 0) return head;
        k = k % n; 
        reverse(l, 0, n - 1);
        reverse(l, 0, k - 1);
        reverse(l, k, n - 1);
        ListNode result = new ListNode(l.get(0));
        ListNode curr = result;
        for (int i = 1; i < l.size(); i++) {
            curr.next = new ListNode(l.get(i));
            curr = curr.next;
        }
        return result;
    }
    public void reverse(List<Integer> l, int i, int j) {
        while (i < j) {
            int temp = l.get(i);
            l.set(i, l.get(j));
            l.set(j, temp);
            i++;
            j--;
        }
    }
}