package JurnalModul5;

public class EdgeList {
    public class Edge{
        Edge next;
        Edge prev;
        Vertex destination;
        Edge(Vertex destination){
           this.destination=destination;
        }
    }
    Edge head;
    Edge tail;
    public void addEdge(Vertex destination){
        Edge newEdge = new Edge(destination);
        if (head==null){
            head=newEdge;
            tail=newEdge;
        }else{
            newEdge.prev=tail;
            tail.next=newEdge;
            tail=newEdge;
        }
    }
    public void printEdge(){
        if (head == null){
            System.out.print("-\n");
        }else{
            Edge current = head;
            while(current != null){
            System.out.print("["+current.destination.city+"] ");
            current=current.next;
            }
            System.out.println();
        }
    }

}
