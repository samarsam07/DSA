static void bubblesort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            boolean swapped=false;
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[j+1]){
                    swapped=true;
                    swap(arr,j,j+1);
                }
            }
            if (swapped==false) {
            break;
            }
        }
    }
     static void swap(int arr[],int first ,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }