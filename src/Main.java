import java.util.*;
public class Main {
    public static void main(String[] args) {
      Print n = new Print(8);
      n.zeroxCount();
    }
}
class SSLL {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    SSLL(){
        this.head = null;
    }

    public void add(int data){
        Node newNode =  new Node(data);
        newNode.next = head;
        head = newNode;
        print();

    }

    public  void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();

    }

    public void insert(int data, int pos){
        Node newNode = new Node(data);
        Node temp = head;
        int i = 1;
        while (i < pos){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        print();

    }

    public  void delete(){
        Node temp = head;
        Node prev = temp;
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }

        prev.next = null;
    }
}
class Print {

    private int pages;
    private int[] printArray;
    Print(int pages){
        this.pages = pages;
    }
    public void zeroxCount (){
        if(pages%2 != 0) pages++;

        printArray = new int[pages];
        int even, odd;
        even  = pages/2;
        odd = pages/2;

        int k = 0;
        printArray[k] = even;

        for(k = 1; k<pages-1; k++){
            if(k%2==0) printArray[k] = --odd;
            else printArray[k] = ++even;

        }

        printArray[k] = ++even;

        System.out.println(Arrays.toString(printArray));
    }

    public void page(){
        if(pages >= 4){
            System.out.println(pages/4);
        }else{
            System.out.println(1);
        }
    }

}