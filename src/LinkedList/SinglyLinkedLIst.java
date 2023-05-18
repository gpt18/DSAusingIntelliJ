package LinkedList;

public class SinglyLinkedLIst {
    static Node head = null;

    int size(){
        Node temp = head;
        int count = 0;
        while(temp != null) {
            temp = temp.next;
            count++;
        }

        return count;
    }
    void  insertAtPosition(int d, int pos){
        if(isEmptyList("insertAtPosition")) return;

        //insert at pos 1
        //insert at pos middle
        //insert at pos last

        /*if pos > size return
            else if pos = 1 insert at head
                else if pos == size insert at end
                else insert at pos*/

        if(pos > size()+1 || pos < 1) System.out.println("Position: Out of range!");
        else if (pos == 1) insertAtHead(d);
        else if (pos == size()+1) insertAtEnd(d);
        else {
            Node newNode = new Node(d);
            Node temp = head;
            Node pre = temp;
            int i = 1;
            while (i <= pos-1){
                pre = temp;
                temp = temp.next;
                i++;
            }
            pre.next = newNode;
            newNode.next = temp;
        }


    }
    void  insertAtEnd(int d){

        if(isEmptyList("insertAtEnd")) return;

        Node newNode = new Node(d);
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;

    }
    void insertAtHead(int d){

        if(isEmptyList("insertAtHead")) return;

        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;

    }
    void display(){

        if(isEmptyList("display")) return;

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    void createLL(int d){
        head = new Node(d);
        System.out.println("Linked List, Successfully created!");
    }

    boolean isEmptyList(String functionName) {
        if(head == null) {
            System.out.println(functionName+"(): List is Empty");
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        SinglyLinkedLIst list = new SinglyLinkedLIst();
        list.createLL(50);
        list.display();
        list.insertAtHead(20);
        list.display();
        list.insertAtPosition(70,2);
        list.display();
        list.insertAtHead(30);
        list.display();
        list.insertAtPosition(40,3);
        list.display();
        list.insertAtEnd(60);
        list.display();

    }
}

class Node{

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}