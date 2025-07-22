package linked_list;

public class MergeSortLL {

    class Node {
        int val;
        Node next;
        Node(){

        }
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    Node getMid(Node head){
        Node midprev=null;
        while(head!=null && head.next!=null){
            midprev=(midprev==null)?head:midprev.next;
            head=head.next.next;
        }
        Node mid=midprev.next;
        midprev.next=null;
        return mid;
    }
    Node merge(Node list1,Node list2){
        Node dummNode=new Node();
        Node tail=dummNode;
        while(list1!=null && list2 !=null){
            if(list1.val<list2.val){
                tail.next=list1;
                list1=list1.next;
                tail=list1;
            }else{
                tail.next=list2;
                list2=list2.next;
                tail=list2;
            }
        }
        tail.next=(list1!=null)?list1:list2;
        return dummNode.next;
    }
    Node sortList(Node head){
        if(head==null || head.next==null)return head;

        Node mid=getMid(head);
        Node left=sortList(head);
        Node right=sortList(mid);
        return merge(left, right);
    }
    public static void main(String[] args) {
        
    }
}
