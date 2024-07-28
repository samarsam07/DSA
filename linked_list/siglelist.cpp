#include <iostream>
using namespace std;

class Node{
    public:
    int data;
    Node *next;
    Node(int data){
        this ->data=data;
        this ->next=NULL;
    }
};
void inserathead(Node* &head,int d){
    // new node create
    Node* temp=new Node(d);
    temp->next=head;
    head=temp;
}
void printlist(Node* &head){
    Node* temp=head;
    while (temp!=NULL){
        cout<< temp->data<<" ";
        temp=temp->next;
    }
    cout<<endl;
}
void insertAttail(Node* & tail,int d){
    Node *temp=new Node(d);
    tail ->next=temp;
    temp->next=NULL;
    tail=temp;
}
void insertAtposition(Node* &tail,Node* &head,int position,int d){
    if(position==1){
        inserathead(head,d);
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
    Node* nodetoInsert=new Node(d);
    nodetoInsert->next=temp->next;
    temp->next=nodetoInsert;
}
void deleteNode(Node* &head,int position){
    if(position==1){
        Node* temp=head;
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
        prev->next=curr->next;
        curr->next=NULL;
        delete curr;
    }
}

int main() {
    
    Node *node1=new Node(10);
    // cout<< node1->data<<endl;
    // cout<< node1->next<<endl;
    Node* head=node1;
    Node* tail=node1;
    printlist(head);

    insertAttail(tail,12);
    printlist(head);
    insertAttail(tail,15);
    printlist(head);
    insertAtposition(tail,head,4,22);
    printlist(head);
    cout<<"head "<<head->data<<endl;
    cout<<"tail "<<tail->data<<endl;
    deleteNode(head,1);
    printlist(head);
    cout<<"head "<<head->data<<endl;
    cout<<"tail "<<tail->data<<endl;
    return 0;
}