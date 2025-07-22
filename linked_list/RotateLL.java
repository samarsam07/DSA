package linked_list;

import linked_list.List.ListNode;

public class RotateLL {
    public static void main(String[] args) {
        
    }
    ListNode rotate(ListNode head,int k){
        if(head==null || head.next==null ||k<=0){
            return head;
        }
        int len=1;
        ListNode last=head;
        while(last.next!=null){
            last=last.next;
            len++;
        }
        last.next=head;
        int rotate=k%len;
        int skip=len-rotate;
        ListNode newLast=head;
        for(int i=0;i<skip-1;i++){
            newLast=newLast.next;
        }
        head=newLast.next;
        newLast.next=null;
        return head;
    }

}
