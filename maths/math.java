public class math {

    public static void main(String[] args) {
        System.out.println(magicNumber(3));
    }
    static int twosComplement(int n) {
         int ans=~n+1;//to get the two's complement of a number, we take the ///one's complement of the number and add 1 to the least significant bit.
        return ans;
    }
    static int magicNumber(int n){
        if(n==0) return 0;
        int cnt=1;
        int ans=0;
        while(n>0){
            int temp=n&1;
            if(temp==1)
            ans=ans+(int)Math.pow(5, cnt);
            n=n>>1;
            cnt++;
        }
        return ans;
    }

}