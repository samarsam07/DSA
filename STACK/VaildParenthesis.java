package STACK;

import java.util.Stack;

public class VaildParenthesis {
    public static void main(String[] args) {
        String s="(()";
        System.out.println(minMovesToMakeVaildPar(s));
    }
    static int minMovesToMakeVaildPar(String s){
       Stack<Character> st=new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch==')'){
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }
            else{
                st.push(ch);
            }
            }
        return st.size();
    }
}

