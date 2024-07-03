#include <iostream>
using namespace std;
void printarray(int arr[],int n){
    for (int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl; 
}
void swaparray(int arr[],int size){
    int temp;
    for (int i = 0; i < size; i+=2)
    {
        if(i+1<size){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    
}

int main() {
    int even[]={1,2,3,43,4,5,6,7};
    int odd[]={1,2,4,3,5};
    swaparray(even,8);
    printarray(even,8);
    swaparray(odd,5);
    printarray(odd,5);


    return 0;
}
