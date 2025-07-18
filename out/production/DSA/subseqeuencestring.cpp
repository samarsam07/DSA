#include <iostream>
#include<string>
#include<vector>
using namespace std;
vector<string> subsequence(string s){
    vector<string> ans;
    string output="";
    int index =0;
    solve(s,output,index,ans);
    return ans;
}
void solve(string s,string output,int index,vector<string> &ans){
    if(index>=s.size()){
        ans.push_back(output)
        return;
    }
    solve(s,output,index+1;ans);

    char element=s[index];
    output.push_back(element);
    solve(s,output,index+1,ans);
}
int main() {
    


    return 0;
}

