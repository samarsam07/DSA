package linked_list;


public class List {
   private static ListNode head;
   private static ListNode tail;
   private static int size;
   
   public List(){
      size=0;
   }

   
   static class ListNode{
      int val;
      ListNode next;
      ListNode(int d){
         this.val=d;
         this.next=null;
      }
   }
   static void insertAt(int val,int index){
      if(index==0){
         inseratAtHead(val);
         return;
      }
      if(index==size){
         insertAtTail(val);
         return;
      }
      ListNode node =new ListNode(val);
      ListNode curr=head;
      while(curr!=null && index>0){
         curr=curr.next;
         index--;
      }
      ListNode temp=curr.next;
      curr.next=node;
      node.next=temp;
      size++;
   }
   static void inseratAtHead(int d){
      // new node create
      ListNode temp=new ListNode(d);
         temp.next=head;
         head=temp;
      if(tail==null){
         tail=head;
      }
      size++;
      
   }
   static void displayList(){
      ListNode temp=head;
      while(temp!=null){
         System.out.print(temp.val+"->");
         temp=temp.next;
      }
      System.out.println("null");
   }
   static void insertAtTail(int val){
      if(tail==null){
         inseratAtHead(val);
         return;
      }
      ListNode node=new ListNode(val);
      tail.next=node;
      tail=node;
      size++;
   }
   static ListNode get(int index){
      ListNode node=head;
      for(int i=0;i<index;i++){
         node=node.next;
      }
      return node;
   }
   static int deleteFirst(){
      int val=head.val;
      head=head.next;
      if(head==null){
         tail=null;
      }
      return val;
   }

 
   public static void main(String[] args) {
      // List l=new List();
      inseratAtHead( 20);
      inseratAtHead( 1);
      inseratAtHead( 3);
      inseratAtHead( 27);
      insertAtTail(9);
      insertAt(12,0);
      displayList();
      System.out.println(size);
   
      
      

   }
    
}