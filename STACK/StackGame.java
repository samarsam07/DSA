package STACK;

import java.util.Stack;

public class StackGame{
    public static void main(String[] args) {
        Stack<Integer> a=new Stack<>();
        Stack<Integer> b=new Stack<>();
        a.push(1);
        a.push(6);
        a.push(4);
        a.push(2);
        a.push(4);
        b.push(5);
        b.push(8);
        b.push(1);
        b.push(2);
        System.out.println(game(a,b,10));
    }
    
    static public int game(Stack<Integer> a,Stack<Integer> b,int max){
        
        int sum=0;
        int ans=solve(a,b,max,sum,0);
        return ans;
    }
    static private int solve(Stack<Integer> a,Stack<Integer> b,int max,int sum,int moves){
        if(sum>max){
            return moves;
        }
        int left=0;
        int right=0;
        if(!a.isEmpty() ){
            int val=a.pop();
            left=solve(a,b,max,sum+val,moves+1);  
        }
        if(!b.isEmpty()){
            int val=b.pop();
            right=solve(a,b,max,sum+val,moves+1);
        }
        int maxMoves=Math.max(left,right);
        return maxMoves;
    }

}
