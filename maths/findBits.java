public class findBits {
    public static void main(String[] args) {
        System.out.println(findBits(3));
    }
    static int findBits(int n){
       int ans=0;
       while(n>0){
        int check=n&1;
        if(check==1){
            ans++;
        }
        n=n>>1;
       }
         return ans;
    }
}
