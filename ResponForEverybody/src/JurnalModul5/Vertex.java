package JurnalModul5;

public class Vertex {
    String city;
    String item[] = new String[2];
    Vertex next;
    boolean visited = false;
    Vertex(String city, String item1, String item2){
        this.city=city;
        item[0]=item1;
        item[1]=item2;
    }
    EdgeList edge = new EdgeList();
    public void addEdge(Vertex destination){
        edge.addEdge(destination);
    }
}
