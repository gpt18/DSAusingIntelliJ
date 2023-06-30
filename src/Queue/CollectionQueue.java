package Queue;

import java.util.*;

public class CollectionQueue {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();

        q.offer(1);
        q.remove();
        System.out.println(q.poll());
        q.offer(4);
        q.offer(3);
        q.offer(2);
        q.offer(5);
        q.poll();
        System.out.println(q);
        System.out.println(q.element());
        System.out.println(q.offerFirst(10));


    }

}
