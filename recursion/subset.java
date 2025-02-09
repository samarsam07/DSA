package recursion;

import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        System.out.println(subset("abc",""));
    }
    static ArrayList<String> subset(String s,String ans){
        if(s.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch=s.charAt(0);
        ArrayList<String> left=subset(s.substring(1), ans+ch);
        ArrayList<String> right=subset(s.substring(1), ans);
        left.addAll(right);
        return left;
    }
}
