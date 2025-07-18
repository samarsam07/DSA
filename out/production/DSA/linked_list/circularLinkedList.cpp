#include <iostream>
using namespace std;
class Node{
public:
     int data;
     Node* next;
     Node(int d){
        this->data=d;
        this->next=NULL;
     }
};
void insertNode(Node* &tail,int element,int d){
    if(tail==NULL){
        Node* node=new Node(d);
        tail=node;
        node->next=node;
    }else{
        Node* curr=tail;
        while(curr->data!=element){
            curr=curr->next;
        }
        Node* temp=new Node(d);
        temp->next=curr->next;
        curr->next=temp;

    }
}
void print(Node* tail){
    Node* temp=tail;
    do
    {  
        cout <<tail->data<<" ";
        tail=tail->next;
    } while (tail !=temp);
    cout<<endl;
}

int main() {
    Node* tail=NULL;    
    insertNode(tail,2,10);
    print(tail);
    insertNode(tail,10,5);
    print(tail);
    insertNode(tail,10,1);
    print(tail);
    cout<<"tail :"<<tail->data<<endl;

    return 0;
}