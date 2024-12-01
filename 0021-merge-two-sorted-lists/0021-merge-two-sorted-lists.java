/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
class Solution {
    ListNode add(ListNode head,int data){
        if(head==null){
            return head;
        }
       
        ListNode newNode = new ListNode(data);
        newNode.next=head;
        
        return newNode;

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List <Integer> list=new ArrayList<Integer>();
        ListNode temp=list1;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        temp=list2;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        ListNode newList=new ListNode();
        Collections.sort(list);
        for(int i=list.size()-1;i>=0;i++){
            add(newList,list.get(i));
        }
        return temp;
    }
}

class Solution {
    ListNode addfirst(ListNode head,int data){
        ListNode newnode = new ListNode(data);
        if(head==null){
            newnode=head;
            return newnode;
        }
        newnode.next=head;
        head=newnode;
        return head;

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List <Integer> list=new ArrayList<Integer>();
        ListNode temp=list1;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        ListNode temp1=list2;
        while(temp1!=null){
            list.add(temp1.val);
            temp1=temp1.next;
        }
        ListNode newlist=new ListNode();
        Collections.sort(list);
        for(int i=list.size()-1;i>=0;i--){
            addfirst(newlist,list.get(i));
        }
        return newlist;
    }
}*/
class Solution {
    ListNode addfirst(ListNode head, int data) {
        ListNode newnode = new ListNode(data);
        if (head == null) {
            return newnode;
        }
        newnode.next = head;
        head = newnode;
        return head;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newlist = new ListNode();
        ListNode tail = newlist; 
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next; 
        }
        if (list1 != null) {
            tail.next = list1;
        } else if (list2 != null) {
            tail.next = list2;
        }
        return newlist.next;
    }
}
