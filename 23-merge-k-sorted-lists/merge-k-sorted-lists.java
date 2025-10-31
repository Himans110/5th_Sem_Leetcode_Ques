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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for (ListNode head : lists) {
            while (head != null) {
                temp.next = new ListNode(head.val);
                temp = temp.next;
                head = head.next;
            }
        }
        return sortList(dummy.next);
    }
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast!=null&& fast.next!=null){
        prev=slow;
        slow=slow.next;
        fast=fast.next.next;
        }
        prev.next=null;
        ListNode left= sortList(head);
        ListNode right= sortList(slow);
        return merge(left,right);
    }
    private ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(l1!= null && l2!=null){
            if(l1.val <l2.val){
                tail.next =l1;
                l1=l1.next;
            }
            else{
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if (l1 != null) tail.next = l1;
        else tail.next = l2;

        return dummy.next;
        
    }
}