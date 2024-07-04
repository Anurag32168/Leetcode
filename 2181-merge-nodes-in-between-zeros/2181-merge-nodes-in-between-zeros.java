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
    public ListNode mergeNodes(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        int sum=0;
        while(temp!=null){
            if(temp.val==0 ){
                if(sum != 0)
                    list.add(sum);
                sum=0;
            }
            sum+=temp.val;
            temp=temp.next;
        }
        ListNode current=new ListNode(-1);
        temp=current;
        for(int i=0;i<list.size();i++){
            ListNode vari=new ListNode(list.get(i));
            temp.next=vari;
            temp=temp.next;
        }
        temp.next=null;
        current=current.next;
        return current;

    }
}