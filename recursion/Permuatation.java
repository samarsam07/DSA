package recursion;

import java.util.ArrayList;
import java.util.List;

public class Permuatation {
    public static void main(String[] args) {
        System.out.println(permutstionString("", "abc"));
    }
    static ArrayList<String> permutstionString(String p,String s){
        if(s.isEmpty()){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        char ch=s.charAt(0);
        ArrayList<String> res=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
            res.addAll(permutstionString(first+ch+second,s.substring(1)));
        }
        return res;
    }

    private List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
        ans=new ArrayList<>();
        helper(nums,0);
        return ans;
    }
    private void helper(int[] nums,int index){
        if(index>=nums.length){
            List<Integer> list=new ArrayList<>();
            for(int num:nums){
                list.add(num);
            }
            ans.add((list));
            return ;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);
            helper(nums,index+1);
            swap(nums,index,i);
        }
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
