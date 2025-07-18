package recursion;
public class skipChar{
public static void main(String[] args) {
    String s="bcdappappleccd";
    
    
     System.out.println(skip( s, 'a'));
     System.out.println(skipString(s, "apple"));
    System.out.println(skipString2(s, "app", "apple"));
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
static String skipString(String s,String c){
    if(s.isEmpty()){
        return "";
    }
    if(s.startsWith(c)){
        return skipString(s.substring(c.length()), c);
    }else{
        return s.charAt(0)+skipString(s.substring(1), c);
    }
}
static String skipString2(String s,String skipString,String notSkip){
if(s.isEmpty()){
    return "";
}
if(s.startsWith(skipString) && !s.startsWith(notSkip)){
    return skipString2(s.substring(skipString.length()), skipString, notSkip);
}else{
    return s.charAt(0)+skipString2(s.substring(1), skipString, notSkip);}
}
}