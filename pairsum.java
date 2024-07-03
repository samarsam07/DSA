import java.util.ArrayList;

public class pairsum {
    static ArrayList<ArrayList<Integer>> pairofsum(int target,int arr[]){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    ans.add(temp);
                }
            }
        }
        return ans;
    }
}
