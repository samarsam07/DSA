package linked_list;

import linked_list.List.ListNode;

public class ReverseList {
    public static void main(String[] args) {
        
    }
    static ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=curr.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
    }
}
