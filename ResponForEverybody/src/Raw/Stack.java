package Raw;

import java.util.NoSuchElementException;

public class Stack {
    private class Node{
        private Object value;
        private Node next;
        Node(Object value){
            this.value = value;
        }
    }
    Node head;
    Node tail;

    public void push(Object value){
        Node newNode = new Node(value);
        if (isEmpty()){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }

    }
    public Object pop(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }else{
            Node popItem = head;
            head = head.next;
            return popItem.value;
        }
    }
    public Object retrieve(){
        return head.value;
    }
    public void printAll(){
        Node current = head;
        while(current!=null){
            System.out.println(current.value);
            current=current.next;
        }
    }


    public boolean isEmpty(){
        return (head == null && tail == null);
    }
}
