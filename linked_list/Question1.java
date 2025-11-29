package linked_list;

public class Question1 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
        
    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null ){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
}
