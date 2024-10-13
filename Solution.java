import java.util.ArrayList;

public class Solution {
    public static void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        while(start<=end){
            swap(s,start,end);
            start++;end--;
        }
    }
    static void swap(char[] s,int start,int end){
        char temp=s[start];
        s[start]=s[end];
        s[end]=temp;
    }
    public int chalkReplacer(int[] chalk, int k) {
        int i=0;
        int size=chalk.length;
        while(k!=0 && chalk[i]>k){
            k=k-chalk[i%size];
            i++;
        }
        return i%size;
    }

    public static void main(String[] args) {
        // char[] name={'h','e','l','l','o'};
        // reverseString(name);
        // System.out.println(name);
        
    }
} 
