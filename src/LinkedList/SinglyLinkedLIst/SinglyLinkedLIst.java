package LinkedList.SinglyLinkedLIst;

public class SinglyLinkedLIst {
    static Node head = null;

    void delete(int d){
        if(isEmptyList("delete")) return;

        Node temp = head;
        Node pre = temp;
        int i = 1;
        while (i <= size()){
            if(temp.data == d && temp == head) {
                deleteFromHead();
                return;
            }else if(temp.data == d && temp.next == null){
                deleteFromEnd();
                return;
            }else{
                if(temp.data == d){
                    pre.next = temp.next;
                    temp.next = null;
                    return;
                }
            }

            pre = temp;
            temp = temp.next;
            i++;
        }

        if(i>size()) System.out.println("Data not found in the list!");

    }


    void deleteFromPosition(int pos){
        if(isEmptyList("deleteFromPosition")) return;

        if(pos > size() || pos < 1) System.out.println("Delete Position: Out of range!");
        else if (pos == 1) deleteFromHead();
        else if (pos == size()) deleteFromEnd();
        else {

            Node temp = head;
            Node pre = temp;
            int i = 1;
            while (i <= pos-1){
                pre = temp;
                temp = temp.next;
                i++;
            }
            pre.next = temp.next;
            temp.next = null;
        }
    }

    void deleteFromEnd() {
        if(isEmptyList("deleteFromEnd")) return;

        Node temp = head;
        Node pre = temp;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }

        pre.next = null;
    }

    void deleteFromHead() {
        if(isEmptyList("deleteFromHead")) return;

        Node temp = head;
        head = head.next;
        temp.next = null;
    }


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
        System.out.println("head: "+head.data+"\tsize: "+size()+"\n");

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
        list.delete(20);
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