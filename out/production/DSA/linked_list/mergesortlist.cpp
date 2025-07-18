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
Node* findmid(Node* head){
    Node* fast=head->next;
    Node* slow=head;
    while(fast!=NULL && fast->next!=NULL){
        slow=slow->next;
        fast=fast->next->next;
    }
    return slow;
}
Node *mergesort(Node* head){
    if(head==NULL || head->next==NULL)
    return head;
// find mid node
    Node *mid=findmid(head);

    Node *left=head;
    Node *right=mid->next;
    mid->next=NULL;
    // break into two part left and right;
    left=mergesort(left);
    right=mergesort(right);
    // merge two parts
    Node* ans=merge(left,right);

    return ans;
}
Node* merge(Node *left,Node* right){
    if(left==NULL)
    return right;
    if(right==NULL)
    return left;

    Node* ans=new Node(-1);
    Node* temp=ans;

    while(left!=NULL && right!=NULL){
        if(left->data<right->data){
            temp->next=left;
            temp=left;
            left=left->next;
        }else{
            temp->next=right;
            temp=right;
            right=right->next;
        }
    }
    while (left!=NULL)
    {
        temp->next=left;
        temp=left;
        left=left->next;
    }
    while (right!=NULL)
    {
        temp->next=right;
        temp=right;
        right=right->next;
    }
    ans=ans->next;
    return ans;
}

int main() {
    


    return 0;
}