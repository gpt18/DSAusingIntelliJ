package LinkedList.CircularLinkedList;

public class CircularLinkedList {

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data =  data;
            next = null;
        }
    }
    private Node head, tail;

    CircularLinkedList(){
        head = null;
        tail = null;
    }

    void add(int d){
        Node newNode = new Node(d);

        if (tail == null){
           head = newNode;
           tail = newNode;
           newNode.next = head;

        }else{
            newNode.next =  head;
            head = newNode;
            tail.next = head;
        }

    }

    void print(){
        Node temp = head;

        if(temp == null) return;
        while(temp.next != head){
            System.out.print(temp.data + " ");
            temp = temp.next;

        }

        System.out.println(temp.data + " ");

    }

    void add(int data, int pos){
        Node newNode = new Node(data);

        if (tail == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;

        }else{
            Node temp = head;
            int count = 0;
            while (count < pos){
                count++;
                temp = temp.next;
            }



        }


    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.print();
        list.add(55);
        list.print();
        list.add(65);
        list.print();
        list.add(48);
        list.print();
        list.add(63);
        list.print();
        System.out.println(list.head + "..\n.." + list.tail + "..\n.." + list.tail.next);
    }
}





