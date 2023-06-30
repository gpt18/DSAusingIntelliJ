package Queue;

import java.util.Arrays;

public class CircularQueue {

    static class Queue{
        int[] arr;
        int rear;
        int front;
        int size;

        Queue(int n){
            this.size = n;
            arr = new int[n];
            rear = -1;
            front = -1;
        }

        public int peek(){
            return arr[front];
        }
        //display
        public void display(){
            if (isEmpty()) {
                System.out.println("The circular queue is empty");
                return;
            }

            int i;
            if (front <= rear) {
                for (i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                for (i = front; i < size; i++) {
                    System.out.print(arr[i] + " ");
                }

                for (i = 0; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("underflow!");
                return -1;
            }
            int result = arr[front];
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }

            return result;

        }

        public void add(int data){
            if(isFull()){
                System.out.println("Overflow!");
                return;
            }

            //adding first element
            if(front == -1){
                front = 0;
            }

            rear = (rear + 1)%size;
            arr[rear] = data;
        }

        public boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public boolean isFull(){
            return (rear+1)%size == front;
        }


    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(60);
        q.display();
        q.add(40);
        q.display();
        q.add(50);
        q.display();
        q.add(30);
        q.display();
        q.add(20);
        q.display();
        q.add(10);
        q.display();
        System.out.println("Removed "+q.remove());
        q.display();
        System.out.println(q.peek());
        q.add(44);
        q.display();

    }
}
