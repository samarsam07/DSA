import java.util.Scanner;

public class WaterMelon {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int w=sc.nextInt();
      String text="";
      
        System.out.println(evenWeight(w));
    }
    static String evenWeight(int n){
        if((n%2)==0 && n-2>0)return "YES";

        return "NO";
    }
}
