package Queue;

public class QueueUsingLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }

            return head.data;

        }

        //dequeue
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }

            Node temp = head;
            if(tail == head){
                tail = head = null;
                return temp.data;
            }

            head = temp.next;
            temp.next = null;

            return temp.data;
        }

        //enqueue
        public void add(int d){
            Node newNode = new Node(d);

            if(isEmpty()){
                tail = head = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        boolean isEmpty(){
            return head == null && tail == null;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println("Peek: "+q.peek());
        q.add(20);
        System.out.println("peek: "+q.peek());
        q.add(36);
        System.out.println("Removed: " +q.remove());
    }
}
