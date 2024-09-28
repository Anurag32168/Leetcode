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
    public int pairSum(ListNode head) {
        ListNode temp=head;
        int x=0;
        while(temp!=null){
            x++;
            temp=temp.next;

        }
        temp=head;
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            arr[i]=temp.val;
            temp=temp.next;
        }
        int max=0;
        for(int i=0;i<x;i++){
            if(max<(arr[i]+arr[x-1-i]))
                max=arr[i]+arr[x-1-i];

        }
        return max;

        
    }
}