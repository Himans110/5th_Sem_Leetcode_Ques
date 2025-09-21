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
    public int gcd(int a , int b){
        int min = Math.min(a,b);
        int gc = -1;
        for(int i = 1 ; i <= min ; i++){
            if(a % i == 0 && b % i == 0){
                gc = i;
            }
        }
        return gc;
    }
}