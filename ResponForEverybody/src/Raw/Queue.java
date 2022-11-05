package Raw;

public class Queue {
    public class Node{
        Object value;
        Node Next;
        Node Previous;
        Node(Object value){
            this.value=value;
        }
    }
    Node Head;
    Node Tail;

    public boolean isEmpty(){
        return (Head == null||Tail==null);
    }
    public void enqueue(Object value){
        Node newNode = new Node (value);
        if (isEmpty()){
            Head = Tail = newNode;
            Head.Previous=null;
            Tail.Next=null;
        }else{
            newNode.Previous = Tail;
            Tail.Next=newNode;
            Tail=newNode;
        }
    }
    public Object dequeue(){
        if (isEmpty()){
            System.out.println("Queue Kosong ");
            return null;
        }else{
            Object temp = Tail.value;
            Tail=Tail.Previous;
            return temp;
        }
    }
    public void printAll(){
        Node current = Head;
        while(current!=null){
            System.out.println(current.value);
            current=current.Next;
        }
    }


}
