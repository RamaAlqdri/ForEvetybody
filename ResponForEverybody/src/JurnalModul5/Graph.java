package JurnalModul5;
public class Graph {
    Vertex head=null;
    Vertex tail=null;
    public void addVertex(String city,String item1, String item2){
        Vertex newVertex = new Vertex(city, item1, item2);
        if (head == null) {
            head = newVertex;
            tail = newVertex;
        }else{
            tail.next=newVertex;
            tail=newVertex;
        }
    }
    public void insertEdge(String sourceCity, String destinationCity){
        Vertex source = searchVertex(sourceCity);
        Vertex destination = searchVertex(destinationCity);
        if (source!=null&&destination!=null){
            source.addEdge(destination);
        }
    }
    Vertex searchVertex(String city){
        Vertex current = head;
        while(current!=null){
            if(current.city.equals(city)){
                return current;
            }
            current=current.next;
        }
        return null;
    }
    public void printAll(){
        Vertex current = head;
        while(current!=null){
            System.out.print("Vertex: [" + current.city+"]");
            System.out.print(" => Edge: ");
            current.edge.printEdge();
            current=current.next;
        }
    }
    public void DFS(Vertex head, Stack stack){
        if (head==null){
            return;
        }else{
            head.visited=true;
            System.out.println(head.city+": ["+head.item[0]+"] ["+head.item[1]+"]");
            if (head.edge.tail!=null){
                EdgeList.Edge neighbor = head.edge.tail;
                while(neighbor!=null){
                    if (!neighbor.destination.visited){
                        stack.push(neighbor.destination);
                    }
                    neighbor=neighbor.prev;
                }
            }
            DFS(stack.pop(),stack);
        }
    }
    public void printDFS(){
        if (head!=null){
            Stack stack = new Stack();
            DFS(head,stack);
        }
        unvisited();
    }
    public void BFS(Vertex head, Queue queue, String item, Doubly.Node data){
        if (head==null){
            return;
        }else{
            head.visited=true;
            if (item.equals(head.item[0])||item.equals(head.item[1])){
                if (!data.found){
                    System.out.println("Ketemu, "+item+" ada di");
                }
                data.found=true;
                System.out.println(data.tahun+", "+head.city);
            }
            if (head.edge.head!=null){
                EdgeList.Edge neighbor = head.edge.head;
                while(neighbor!=null){
                    if (!neighbor.destination.visited){
                        queue.enqueue(neighbor.destination);
                    }
                    neighbor=neighbor.next;
                }
            }
            BFS(queue.dequeue(),queue,item, data);
        }
    }
    public void BFSSearch(String item, Doubly.Node data){
        if (head!=null){
            Queue queue = new Queue();
            BFS(head,queue,item, data);
        }
        unvisited();
    }
    public void unvisited(){
        Vertex current = head;
        while(current!=null){
            current.visited=false;
            current=current.next;
        }
    }
}