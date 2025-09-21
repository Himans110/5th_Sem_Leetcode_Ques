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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        List<Integer> l = new ArrayList<>();
        while (head != null && head.next != null) {
            int a = head.val;
            int b = head.next.val;
            l.add(a);
            l.add(gcd(a, b));
            head = head.next;
        }
        if (head != null) {
            l.add(head.val);
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int i : l) {
            current.next = new ListNode(i);
            current = current.next; 
        }
        return dummy.next;
    }
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a%b);
    }
}