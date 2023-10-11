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
    public ListNode merger(ListNode h1, ListNode h2){
        ListNode res = new ListNode(0);
        ListNode ans = res;
        while(h1 != null && h2 !=null){
            if(h1.val < h2.val){
                ans.next = h1;
                h1 = h1.next;
            }
            else{
                ans.next = h2;
                h2 = h2.next;
            }
            ans = ans.next;
        }
        ans.next = (h1 != null) ? h1 : h2;
        return res.next;
    }
    public ListNode mergeHelper(ListNode[] lists, int start, int end){
        if(start == end){
            return lists[start];
        }
        if(start + 1 == end){
            return merger(lists[start] , lists[end]);
        }
        int mid = start + (end-start)/2;
        ListNode left = mergeHelper(lists, start, mid);
        ListNode right = mergeHelper(lists, mid+1, end);
        return merger(left, right);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0 || lists == null){
            return null;
        }
        
        return mergeHelper(lists, 0, lists.length-1);
    }
}