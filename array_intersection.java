import java.util.ArrayList;

class array_intersection{
    static ArrayList<Integer> intersection(int arr1[],int arr2[]){
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            int element=arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                if(element<arr2[j]){
                    break;
                }
                if (element==arr2[j]) {
                    ans.add(element);
                    arr2[i]=Integer.MIN_VALUE;
                    break;
                }
            }
        } 
        return ans;
    }
    static ArrayList<Integer> Optim_intersection(int arr1[],int arr2[]){
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
        while (i<arr1.length && j<arr2.length) {
            if (arr1[i]<arr2[j]) {
                i++;
            }
            else if(arr1[i]==arr2[j]){
                ans.add(arr1[i]);
                i++;j++;
            }
            else{
                j++;
            }
        }
        return ans;
        }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={3,4,4,5};
        ArrayList<Integer> a=new ArrayList<>();
        a=Optim_intersection(arr1,arr2);
        System.out.println(a);
    }
}