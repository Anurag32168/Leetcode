
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list2==null){
            return list1;
        }
        if(list1==null)
        return list2;
        ListNode temp1=list1;
        ListNode temp2=list1;
    
        for(int i=0;i<a-1;i++){
            temp1=temp1.next;
        }
        for(int i=0;i<b+1;i++){
            temp2=temp2.next;
        }
        ListNode current=list2;
        temp1.next=current;
        while(current.next!=null){
            current=current.next;
        }
        current.next=temp2;
        return list1;
    }
}