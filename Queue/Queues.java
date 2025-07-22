package Queue;
import java.util.*;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        System.out.println(q);
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(89);
        
        deque.addLast(10);
        deque.addFirst(40);
        deque.removeFirst();

    }
}
