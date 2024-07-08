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
       public ListNode oddEvenList(ListNode head) {
         if(head==null||head.next==null)
        return head;

        ListNode new_node=new ListNode(-1); 
        ListNode current=new_node;
        ListNode temp=head;
        while(temp!=null){
            ListNode value=new ListNode(temp.val);
            current.next=value;
            current=current.next;
            if(temp.next==null)
            break;
            temp=temp.next.next;
        }  
        temp=head.next;
        while(temp!=null){
            ListNode value=new ListNode(temp.val);
            current.next=value;
            current=current.next;
            if(temp.next==null)
            break;
            temp=temp.next.next;
        }  
        new_node=new_node.next;
        return new_node;
    }
}