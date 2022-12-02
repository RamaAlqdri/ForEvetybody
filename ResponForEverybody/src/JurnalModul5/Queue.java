package JurnalModul5;

import java.util.NoSuchElementException;

public class Queue {
    public class Node{
        Vertex value;
        Node Next;
        Node Previous;
        Node(Vertex value){
            this.value=value;
        }
    }
    Node Head;
    Node Tail;

    public boolean isEmpty(){
        return (Tail == null);
    }
    public void enqueue(Vertex value){
        Node newNode = new Node (value);
        if (isEmpty()){
            Head = newNode;
            Tail = newNode;
            Head.Previous=null;
            Tail.Next=null;
        }else if(!isAvalaible(value)){
            newNode.Next = Head;
            Head.Previous=newNode;
            Head=newNode;
        }
    }
    public Vertex dequeue(){
        if (isEmpty()){
            return null;
        }else{
            Vertex temp = Tail.value;
            if (Tail.Previous!=null){
                Tail=Tail.Previous;
            }else{
                Tail = null;
            }
            return temp;
        }
    }
    public Vertex peek(){
        return Tail.value;
    }
    public void printAll(){
        Node current = Head;
        while(current!=null){
            System.out.print(current.value.city+"["+current.value.visited+"], ");
            current=current.Next;
        }
    }
    public boolean isAvalaible(Vertex value){
        Node current = Head;
        while (current!= null){
            if (current.value==value){
                return true;
            }
            current=current.Next;
        }
        return false;
    }


}
