#include <iostream>
#include<vector>
using namespace std;

int funduplicate(vector<int> &arr){
    int ans=0;
     for (int i = 0; i < arr.size(); i++)
     {
        ans^=arr[i];
     }
     for (int i = 1; i < arr.size(); i++)
     {
        ans^=i;
     }
     return ans;
}

int main() {

    return 0;
}