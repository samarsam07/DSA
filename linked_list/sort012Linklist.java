package linked_list;

public class sort012Linklist {
    int val;
    sort012Linklist next;
    static sort012Linklist head;
    sort012Linklist(int d){
        this.val=d;
        this.next=null;
    } 
    static void insertnodeathead(int d){
        sort012Linklist temp=new sort012Linklist(d);
        head.next=temp;
    }
    static void printlist(){
        sort012Linklist temp=head;
        while (temp!=null) {
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        sort012Linklist node=new sort012Linklist(1);

        head=node;
        // System.out.println(head.val);
        insertnodeathead(0);
        printlist();;

    }
    static void sort012(){
        int zero=0;int one=0;
        int two=0;
        sort012Linklist temp=head;
        while (temp!=null) {
            if(temp.val==0)
            zero++;
            else if (temp.val==1)
            one++;
            else if(temp.val==2)
            two++;
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(zero!=0){
                temp.val=0;
                zero--;
            }else if(one!=0){
                temp.val=1;
                one--;
            }
            else if(two!=0){
                temp.val=2;
                two--;
            }
            temp=temp.next;
        } 
    }
}
