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
        ListNode temp1=head;
        
        while(temp1.next!=null){
            int a=temp1.val;
            int b=temp1.next.val;
            int mi=Math.min(a,b);
            int note=1;
            for(int i=mi;i>=1;i--){
                if((a%i==0) && (b%i==0)){
                    note=i;
                    break;
                }
            }
            ListNode newnode1=new ListNode(note);
            
            
            ListNode newnode2=temp1.next;
            temp1.next=newnode1;
            temp1=temp1.next;
            temp1.next=newnode2;
            temp1=temp1.next;


        }
        return head;
    }
}