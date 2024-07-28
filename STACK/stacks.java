package STACK;

public class stacks {
   public static void main(String[] args) {
    stack s=new stack(10);
    
    s.push(10);
    s.push(13);
    s.push(22);
    System.out.println(s.peek());
    s.pop();
    System.out.println(s.peek());
    s.pop();
    s.pop();
    s.pop();
    System.out.println(s.isempty());
   }
}
class stack{
    int top;
    int arr[];
    int size;
    stack(int size){
        this.size=size;
        arr=new int[size];
        top=-1;
    }
    void push(int element){
        if(size-top>1){
            top++;
            arr[top]=element;
        }else{
            System.out.println("stack Overflow");
        }
    }
    void pop(){
        if(top<0){
            System.out.println("stack underflow");
        }else{
            top--;
        }
    }
    boolean isempty(){
        if(top<0){
            return true;
        }
        return false;
    }
    int peek(){
        if(top>=0)
        return arr[top];
        else
        return -1;
    }
}
