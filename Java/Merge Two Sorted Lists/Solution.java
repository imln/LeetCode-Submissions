/*Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4*/


class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        ListNode head = new ListNode(0);
        ListNode tail = head;
        while(ptr1 != null && ptr2 != null){
            if(ptr1.val <= ptr2.val){
                tail.next = ptr1;
                ptr1 = ptr1.next;
            }else{
                tail.next = ptr2;
                ptr2 = ptr2.next;
            }
            tail = tail.next;
        }
        
        if(ptr1 == null){
            tail.next = ptr2;
        }else{
            tail.next = ptr1;
        }
        return head.next;
    }
}
