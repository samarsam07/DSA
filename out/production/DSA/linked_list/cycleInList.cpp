#include <iostream>
#include<map>
using namespace std;
class Node{
    public:
    int val; 
    Node* next;
    Node(int d){
        this->val=d;
        this->next=NULL;
    }
};
bool detectloop(Node * head){
    if(head==null){
        return false;
    }
    map<Node*,bool> visited;   
    Node* temp=head;
    while(temp!=NULL){
        if(visited[temp]==true){
            return true;
        }
        visited[temp]=true;
        temp=temp->next;
    } 
    return false;
}


int main() {
    


    return 0;
}