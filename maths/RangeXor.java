public class RangeXor {
    public static void main(String[] args) {
        System.out.println(rangeXor(10));
    }
    // it gives xor from 0 to a
    static int rangeXor(int a){
        if(a%4==0) return a;
        if(a%4==1) return 1;
        if(a%4==2) return a+1;
        return 0;
    }
}
