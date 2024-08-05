#include <iostream>
#include<queue>
using namespace std;
class Node{
    public:
    int val;
    Node* left;
    Node * right;
    Node(int d){
        this->val=d;
        this->left=NULL;
        this->right=NULL;
    }
};
Node* buildtree(Node* root){
    cout<<"enter the data"<<endl;
    int data;
    cin>>data;
    root=new Node(data);
    if(data ==-1){
        return NULL;
    }
    cout<<"enter the data for inserting in the left of"<<data<<endl;
    root->left=buildtree(root->left);
    cout<<"enter the data for inserting in the right of"<<data<<endl;
    root->right=buildtree(root->right);
    return root;
}
void levelorderTraverse(Node* root){
    queue<Node*> q;
    q.push(root);
    q.push(NULL);
    while(!q.empty()){
        Node* temp=q.front();
        q.pop();
        if(temp==NULL){
            cout<<endl;
            if(!q.empty()){
                q.push(NULL);
            }
        }else{
            cout<<temp->val<<" ";
            if(temp->left){
                q.push(temp->left);
            }
            if(temp->right){
                q.push(temp->right);
            }
        }
        
    }
}
void InorderTraverse(Node *Root){
    if(Root==NULL){
        return;
    }
    InorderTraverse(Root->left);
    cout<<Root->val<<" ";
    InorderTraverse(Root->right);
    // cout<<Root->right<<" ";
}
void preorder(Node* root){
     if(root==NULL){
        return;
    }
     cout<<root->val<<" ";
    preorder(root->left);
    preorder(root->right);
}

int main() {
    Node *root=nullptr;

    root=buildtree(root);
    // 1 3 7 -1 -1 11 -1 -1 5 9 -1 -1 -1
    levelorderTraverse(root);
    InorderTraverse(root);
    preorder(root);


    return 0;
}