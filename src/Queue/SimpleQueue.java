package Queue;

public class SimpleQueue {

    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n) {
            arr = new int[n];
            size = n;
        }

        int peek(){
            return arr[0];
        }

        //remove all elements form queue
        void clear(){
            rear = -1;
        }

        //dequeue
        int remove(){
            if(isEmpty()){
                System.out.println("Underflow!");
                return -1;
            }else{
                int data = arr[0];
                for(int i=1; i<=rear; i++){
                    arr[i-1] = arr[i];
                }
                rear--;

                return data;
            }

        }

        //enqueue
        void add(int data){

            //queue is empty
            if(isFull()){
                System.out.println("Overflow!");
                return;
            }else{
                rear++;
                arr[rear] = data;
            }
        }

        //print queue
        void display(){
            for(int i=0; i<=rear; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        //check full - overflow
        boolean isFull(){
            return rear == size-1;
        }
        //check empty - underflow
        boolean isEmpty(){
            return rear == -1;
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.display();

        //to check overflow
        q.add(25);
        q.display();
        q.add(36);
        q.display();
        q.add(54);
        q.display();
        q.add(48);
        q.display();
        q.add(41);
        q.display();
        q.add(88);

        q.clear();

        //to check underflow
        System.out.println(q.remove());
        q.add(50);
        q.display();
        q.add(36);
        q.display();
        q.add(54);
        q.display();
        q.add(48);
        q.display();
        q.add(41);
        q.display();
        System.out.println(q.remove());
        q.display();

        System.out.println(q.peek());

    }
}
