package recursion;
public class skipChar{
public static void main(String[] args) {
    String s="bacccaad";
    
    
    System.out.println(skip( s, 'a'));
}
static String skip(String s,char c){
    if(s.isEmpty()){
        return "";
    }
    char ch=s.charAt(0);
    if(ch==c){
        return skip(s.substring(1), c);
    }else{
        return ch+ skip( s.substring(1), c);
    }
}
}