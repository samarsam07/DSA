public class chalk {
    public static void main(String[] args) {
      int [] chalk = {3,4,1,2};
      System.out.println(search(chalk, 25));  
    }static int search(int []chalk ,int k){
        int i =0;
        while(k>=0){
            i = i % chalk.length;
            k = k-chalk[i];
            i++;
        }return i-1;
    }
}
