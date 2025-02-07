public class power {
    public static void main(String[] args) {
        System.out.println(power(2,4));
    }
    static int power(int base,int power){
        int ans=1;
        while(power>0){
            int ckeck=power&1;
            if(ckeck==1){
                ans=ans*base;
            }
            base=base*base;
            power=power>>1;
        }
        return ans;
    }
}
