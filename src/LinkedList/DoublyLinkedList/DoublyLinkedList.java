package LinkedList.DoublyLinkedList;

public class DoublyLinkedList {
    static Node head = null;
    static Node tail = null;
    static  void print(){
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("head: "+head.data+"\ttail: "+tail.data+"\tsize: "+length()+"\n");

    }

    //gives the length of linked list
    static int length() {
        int len = 0;
        Node temp = head;

        while(temp != null) {
            len++;
            temp = temp.next;
        }

        return len;
    }

    static void insertAtHead(int d){

        if(head == null){
            Node newNode = new Node(d);
            head = newNode;
            tail = newNode;
        }else{
            Node newNode = new Node(d);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

    }

    static void insertAtTail(int d){

        if(tail == null){
            Node newNode = new Node(d);
            head = newNode;
            tail = newNode;
        }else{
            Node newNode = new Node(d);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

    }

    static void insertAtPosition(int d, int pos){

        //inserting at start
        if(pos == 1){
            insertAtHead(d);
            return;
        }

        Node temp = head;
        int i = 1;

        while(i < pos-1){
            temp = temp.next;
            i++;
        }

        //insert at last position
        if(temp.next == null){
            insertAtTail(d);
            return;
        }

        //creating a new node for d
        Node newNode = new Node(d);

        //insert at middle
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;



    }

    static  void deleteNode(int pos){

        //deleting from head
        if(pos == 1){
            Node temp = head;
            temp.next.prev = null;
            head = temp.next;
            temp.next = null;
        }else{

            //deleting any middle node or last node
            Node curr = head;
            Node pre = curr;

            int i = 1;
            while(i < pos){
                pre = curr;
                curr = curr.next;
                i++;
            }

            curr.prev =null;
            pre.next = curr.next;
            curr.next = null;

            //handling tail while deleting last node
            if(pre.next == null) tail = pre;

        }
    }
    public static void main(String[] args) {

        insertAtHead(30);
        print();

        insertAtHead(40);
        print();

        insertAtHead(50);
        print();

        insertAtTail(10);
        print();

        deleteNode(3);
        print();

    }
}

class Node {
    int data;
    Node prev;
    Node next;

    //constructor
    Node(int d){
        this.data = d;
        this.prev = null;
        this.next = null;
    }
}
