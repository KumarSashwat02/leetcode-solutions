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
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode res = head;
//         if(head.val == n && head.next == null){
//             return null;
//         }
//         if(head.val == n && head.next != null){
//             head = head.next;
//             return head;
//         }
//         while(head != null && head.next != null){
//             if(head.next.val == n && head.next.next != null){
//                 head.next = head.next.next;
//             }
//             else if(head.next.val == n && head.next.next == null){
//                 head.next = null;
//             }
//             head = head.next;
//         }
//         return res;
//     }
// }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        ListNode slow = head;
        ListNode fast = head;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        if(fast == null){
            return head.next;
        }
          
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;           
        }
        slow.next=slow.next.next;
        return head;
    }
}