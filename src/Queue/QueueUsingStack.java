package Queue;

import java.util.Stack;

public class QueueUsingStack {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    static class Queue{

        public int peek(){
            if(isEmpty()) {
                System.out.println("queue is empty.");
                return -1;
            }
            return s1.peek();
        }

        public int remove(){
           if(isEmpty()) {
               System.out.println("queue is empty.");
               return -1;
           }
           return s1.pop();
        }

        public void add(int data){
            if(isEmpty()){
                s1.push(data);
                return;
            }

            while(!s1.isEmpty()){
               s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public boolean isEmpty(){
            return s1.isEmpty();
        }
    }

    public static void main(String[] args) {



        Queue q = new Queue();
        q.add(1);
        System.out.println(s1);
        q.add(5);
        System.out.println(s1);
        q.add(4);
        System.out.println(s1);
        q.add(2);
        System.out.println(s1);
        System.out.println(q.remove());

    }
}
