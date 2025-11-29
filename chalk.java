public class chalk {
    public static void main(String[] args) {
      int [] chalk = {3,4,1,2};
      System.out.println(squares(2 , 4));  
    }static int search(int []chalk ,int k){
        int i =0;
        while(k>=0){
            i = i % chalk.length;
            k = k-chalk[i];
            i++;
        }return i-1;
    }
    public static int squares(int a, int b) {
    // Write your code here
        int cnt=0;
        int i=1;
        int sq=1;
        while(sq<a){
             sq=i*i;
            if(sq>=a && sq<=b ){
                cnt++;
            }
            if(sq>b){
                break;
            }
            i++;
        }
        return cnt;

    }

}
