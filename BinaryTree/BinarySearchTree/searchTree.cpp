#include <iostream>
#include<queue>
using namespace std;
class Node{
  public:
  int val;
  Node* left;
  Node* right;
  Node(int d){
    this->val=d;
    this->left=NULL;
    this->right=NULL;
  }  
};
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
Node* deleteNodeFromBST(Node* root,int val){
    if(root==NULL){
        return NULL;
    }
    if(root->val==val){
        if(root->left==NULL && root->right==NULL){
            delete root;
            return NULL;
        }
        if(root->left!=NULL && root->right==nullptr){
            Node* temp=root->left;
            delete root;
            return temp;
        }
        if(root->left==NULL && root->right!=nullptr){
            Node* temp=root->right;
            delete root;
            return temp;
        }
        if(root->left!=NULL && root->right!=nullptr){
           int mini=minVal(root->right)->val;
           root->val=mini;
           root->right=deleteNodeFromBST(root->right,mini);
           return root;
        }
    }
    else if(root->val>val){
        root->left=deleteNodeFromBST(root->left,val);
        return root;
    }
    else{
        root->right=deleteNodeFromBST(root->right,val);
        return root;
    }
}
Node* minVal(Node* root){
    Node* temp=root;
    while(temp->left!=nullptr){
        temp=temp->left;
    }
    return temp;
}

Node* insertIntoTree(Node* root,int d){
    if(root==NULL){
        root=new Node(d);
        return root;
    }
    if(d>root->val){
        root->right=insertIntoTree(root->right,d);
    }
    else{
         root->left=insertIntoTree(root->left,d);
    }
    return root;
}
void takeInput(Node* &root){
    int data;
    cin>>data;
    while(data!=-1){
        root=insertIntoTree(root,data);
        cin>>data;
    }
}
int main() {
    
    Node* root=NULL;
    cout<<"enter the data in tree"<<endl;
    takeInput(root);
    cout<<"printing tree"<<endl;
    levelorderTraverse(root);

    return 0;
}