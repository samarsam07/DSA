#include <iostream>
#include<stack>
using namespace std;
 bool isValid(String s) {
        stack<int> ans;
        for (int i = 0; i < s.length(); i++)
        {
           if(s[i]='('){
            ans.push(1);
           }
           if(s[i]='['){
            ans.push(2);
           }
           if(s[i]='{'){
            ans.push(3);
           }
           if (s[i]=')'&& ans.top()==1){
            ans.pop();
           }else{
            return false;
           }
           if (s[i]=']'&& ans.top()==2){
            ans.pop();
           }else{
            return false;
           }
           if (s[i]='}'&& ans.top()==3){
            ans.pop();
           }else{
            return false;
           }
        }
        if (ans.empty()){
        return true;
        }
        return false;
        
    }

int main() {
    


    return 0;
}