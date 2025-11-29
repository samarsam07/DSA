package DynamicProgramming;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(500000));
    }
    public static long fibo(int n){
        long ans=0;
        long prev[]=new long[2];
        prev[0]=0;
        prev[1]=1;
        for(int i=2;i<n;i++){
            ans=prev[0]+prev[1];
            prev[0]=prev[1];
            prev[1]=ans;
        }
        return ans;
    }
}
