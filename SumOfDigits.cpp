#include <iostream>
#include<string>
using namespace std;

 string  ToNum(string s){
        string num="";
         for(int i=0;i<s.length();i++){
            int temp=s[i]-'0';
            num.push_back(temp);
        }
        return num;
    }
    int getLucky(string s, int k) {
        int ans=0;
        int cnt=0;
        string temp="";
        // for(int i=0;i<s.length();i++){
        //     int tem=s[i]-'a';
        //     tem+=1;
        //     temp.push_back(tem + '0');
        // }
        temp.push_back(108);
        cout<<"first transform :"<<temp<<endl;

        string num=temp;
        while(cnt<k){
            int sum=0; 
            for(int i=0;i<num.length();i++){
                int val=num[i];
                sum+=val;
            }
            string m="";
            m.push_back(sum);
            cout<<"next transforms :"<<m<<endl;
            num =ToNum(m);
            ans=sum;
            cnt++;
        }
        return ans;
    }
int main() {
    // Solution obj=new Solution();
    int ans=getLucky("leetcode",2);
    cout<<"ans :"<<ans<<endl;
    return 0;
}