package LinkedList.Stack;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
       StackUsingLinkedList stack = new StackUsingLinkedList();
        System.out.println(stack.peek());
       stack.push(25);
       stack.push(30);
       stack.push(30);
        stack.display();
        System.out.println(stack.peek());
       stack.push(30);
       stack.push(30);
       stack.push(30);

       stack.display();
        System.out.println(stack.isEmpty());
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println(stack.isEmpty());
    }
}

class StackUsingLinkedList {
    static class Node {
        int data;
        Node link;
    }

    Node top;
    StackUsingLinkedList() {
        this.top  = null;
    }

    public int peek(){
        if(top == null){
            System.out.println("Stack is empty!");
            return -1;
        }
        else {
            return top.data;
        }
    }

    public void pop(){
        if (top == null){
            System.out.println("Stack Underflow!");
            return;
        }

        Node temp = top;
        top = temp.link;
        temp.link = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int d){
        Node newNode = new Node();

        if(newNode == null){
            System.out.println("Stack Overflow!");
            return;
        }

        newNode.data = d;
        newNode.link = top;
        top = newNode;
    }

    public void display(){
        if(top == null){
            System.out.println("Stack Underflow!");
            exit(1);
        }
        else{
            Node temp = top;
            while(temp != null){
                System.out.print(temp.data);

                temp = temp.link;
                if (temp != null){
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }

    }
}