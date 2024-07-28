package Queue;

import java.util.*;

public class reverse {
    public static void main(String[] args) {
        String Word="Hello World";
        Stack<String> ans=new Stack<>();
        StringTokenizer temp=new StringTokenizer(Word);
        while(temp.hasMoreTokens()){
            ans.add(temp.nextToken());
        }
        StringBuilder a=new StringBuilder();
        while(!ans.empty()){
            a.append(ans.pop());
            a.append(" ");
        }
        System.out.println(a);
        String b=a.toString();
        System.out.println(b);
    }
}
