package JurnalModul5;

public class Doubly {
    public class Node{
        boolean found=false;
        int tahun;
        Graph Avenger;
        Node(int tahun, Graph Avenger){
            this.tahun=tahun;
            this.Avenger=Avenger;
        }
        Node next;
        Node previous;
    }
    Node head = null;
    Node tail = null;
    public void addLast(int tahun, Graph Avenger){
        if (head==null){
            head = tail = new Node(tahun,Avenger);
            head.previous=null;
            tail.next=null;
        }else{
            Node temp = new Node(tahun,Avenger);
            tail.next=temp;
            temp.previous=tail;
            tail=temp;
            tail.next=null;
        }
    }
    public void printAll(){
        Node current = head;
        while(current!=null){
            System.out.println("Tahun "+ current.tahun);
            current.Avenger.printAll();
            System.out.println();
            current=current.next;
        }
    }
    public void printDFS(){
        Node current = head;
        while(current!=null){
            System.out.println("Tahun "+ current.tahun);
            current.Avenger.printDFS();
            System.out.println();
            current=current.next;
        }
    }
    public void BFSSearch(String item){
        System.out.println("Cari: "+item);
        Node current = head;
        while(current!=null){
            current.Avenger.BFSSearch(item, current);
            if (current.next!=null){
                current.next.found= current.found;
            }
            current=current.next;
        }
    }
}