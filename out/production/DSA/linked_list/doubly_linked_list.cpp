#include <iostream>
using namespace std;

class Node{
public:
    int data;
    Node* prev;
    Node* next;
    Node(int data){
        this->data=data;
        this->next=NULL;
        this->prev=NULL;
    }
};
void print(Node* head){
    Node* temp=head;
    while (temp!=NULL)
    {
        cout<<temp->data<<" ";
        temp=temp->next;
    }
    cout<<endl;
}
int getlength(Node* head){
    int len=0;
    Node* temp=head;
    while (temp!=NULL)
    {
        len++;
        temp=temp->next;
    }
    return len;
}
void insertAthead(Node* &head,int d){
    Node* temp=new Node(d);
    temp->next=head;
    head->prev=temp;
    head=temp;
}
void insertAttail(Node* &tail,int d){
    Node* temp=new Node(d);
    tail->next=temp;
    temp->prev=tail;
    tail=temp;
}
void deleteNode(Node* &head,int position){
    if(position==1){
        Node* temp=head;
        temp->next->prev=NULL;
        head=head->next;
        temp->next=NULL;
        delete temp;
    }else{
        int cnt=1;
        Node* curr=head;
        Node* prev=NULL;
        while(cnt<position){
            prev=curr;
            curr=curr->next;
            cnt++;
        }
        curr->prev=NULL;
        prev->next=curr->next;
        curr->next=NULL;

        delete curr;
    }
}
void insertAtanyposition(Node* &tail,Node* &head,int position ,int d){
     if(position==1){
        insertAthead(head,d);
        return ;
    }
    Node* temp=head;
    int cnt=1;
    while(cnt<position-1){
        temp=temp->next;
        cnt++;
    }
    if(temp->next==NULL){
        insertAttail(tail,d);
        return;
    }
    Node* nodetoinsert=new Node(d);
    nodetoinsert->next=temp->next;
    temp->next->prev=nodetoinsert;
    temp->next=nodetoinsert;
    nodetoinsert->prev=temp;
}


int main() {
    Node* node1=new Node(10);
    Node* head=node1;
    Node* tail=node1;
    print(head);
    cout<<getlength(head)<<endl;
    insertAthead(head,12);
    print(head);
    insertAttail(tail,3);
    print(head);
    insertAttail(tail,100);
    print(head);
    insertAtanyposition(tail,head,1,9);
    print(head);
    deleteNode(head,1);
    print(head);
    cout<<head->data<<endl;


    return 0;
}