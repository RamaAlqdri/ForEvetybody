package ResponModul2;

public class Queue {
    public class Node{
        String Nama;
        int Tinggi;
        Node Next;
        Node Previous;
        Node(String Nama, int Tinggi){
            this.Nama=Nama;
            this.Tinggi=Tinggi;
        }
    }
    Node Head;
    Node Tail;

    public boolean isEmpty(){
        return (Head == null||Tail==null);
    }
    public void enqueue(String Nama, int Tinggi){
        Node newNode = new Node (Nama, Tinggi);
        if (isEmpty()){
            Head = Tail = newNode;
            Head.Previous=null;
            Tail.Next=null;
        }else{
            if (newNode.Tinggi< Tail.Tinggi){
                Tail.Next=newNode;
                newNode.Previous=Tail;
                Tail=newNode;
            }else if (newNode.Tinggi> Head.Tinggi){
                newNode.Next=Head;
                Head.Previous=newNode;
                Head=newNode;
            }else{
                Node current = Tail;
                while (current.Previous!=null){
                    if (newNode.Tinggi>current.Tinggi){
                        Node prevCur = current.Previous;
                        newNode.Next=current;
                        current.Previous=newNode;
                        prevCur.Next=newNode;
                        newNode.Previous=prevCur;
                    }
                    current=current.Previous;
                }
            }
        }
    }
    public Node dequeue(){
        if (isEmpty()){
            System.out.println("Queue Kosong ");
            return null;
        }else{
            Node temp = Tail;
                Tail=Tail.Previous;
            return temp;
        }
    }
    public void dequeueAll(){
        while(true) {
            if (isEmpty()) {
                return;
            } else {
                Node temp = dequeue();
                System.out.println(temp.Nama + ", " + temp.Tinggi + " cm");
            }
        }
    }


}
