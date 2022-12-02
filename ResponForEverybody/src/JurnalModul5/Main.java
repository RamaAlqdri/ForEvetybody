package JurnalModul5;

public class Main {
    public static void main(String[] args) {
        Graph thn1970 = new Graph();
        thn1970.addVertex("New York", "Super Serum", "Mie Ayam Ceker");
        thn1970.addVertex("Markas S.H.I.E.L.D.", "Partikel Pym", "Seblak Korea");
        thn1970.addVertex("Wakanda", "Vibranium", "Adamantium");
        thn1970.addVertex("Asgard", "Mjolnir", "Sprite");
        thn1970.addVertex("Vormir", "Soul Stone", "Ceker Mercon");

        thn1970.insertEdge("New York", "Markas S.H.I.E.L.D.");
        thn1970.insertEdge("Markas S.H.I.E.L.D.","Wakanda");
        thn1970.insertEdge("Wakanda", "New York");
        thn1970.insertEdge("New York","Asgard");
        thn1970.insertEdge("Asgard","Vormir");

        Graph thn2012 = new Graph();
        thn2012.addVertex("New York", "Space Stone", "Nasi Padang");
        thn2012.addVertex("Sanctum Sanctorum", "Thai Tea", "Time Stone");
        thn2012.addVertex("Morag", "Power Stone", "Es Semangka India");
        thn2012.addVertex("Kekalik", "Suit IronMan", "Printer");
        thn2012.addVertex("Midgard", "Boba", "Sempol");

        thn2012.insertEdge("New York", "Sanctum Sanctorum");
        thn2012.insertEdge("Sanctum Sanctorum","Morag");
        thn2012.insertEdge("Sanctum Sanctorum","Midgard");
        thn2012.insertEdge("Midgard","Kekalik");
        thn2012.insertEdge("Morag","Kekalik");

        Graph thn2015 = new Graph();
        thn2015.addVertex("Hollywood", "DVD Avenger", "Microphone");
        thn2015.addVertex("Knowhere", "Mind Stone", "Batu Akik");
        thn2015.addVertex("New York", "KFC", "IPhone 13");
        thn2015.addVertex("Vormir", "Mouse Wireless", "Keyboard");
        thn2015.addVertex("Asgard", "Mjolnir", "Storm Breaker");
        thn2015.addVertex("Qatar", "Yamaha YZR-M1", "Ducati GP15");
        thn2015.addVertex("Valencia", "Kartu UNO", "Kartu Remi");

        thn2015.insertEdge("Hollywood","Knowhere");
        thn2015.insertEdge("Knowhere","New York");
        thn2015.insertEdge("New York","Vormir");
        thn2015.insertEdge("Vormir","Hollywood");
        thn2015.insertEdge("New York","Asgard");
        thn2015.insertEdge("New York","Valencia");
        thn2015.insertEdge("Valencia","Qatar");
        thn2015.insertEdge("Asgard","Qatar");

        Doubly EndGame = new Doubly();
        EndGame.addLast(1970,thn1970);
        EndGame.addLast(2012,thn2012);
        EndGame.addLast(2015,thn2015);
        System.out.println("|xxxxxxxxxxxxxxxxxxxx| Membuat Graph |xxxxxxxxxxxxxxxxxxxx|");
        EndGame.printAll();
        System.out.println("|xxxxxxxxxxxxxxxxxxxx| DFS PRINT |xxxxxxxxxxxxxxxxxxxx|");
        EndGame.printDFS();
        System.out.println("|xxxxxxxxxxxxxxxxxxxx| BFS SEARCHING |xxxxxxxxxxxxxxxxxxxx|");
        EndGame.BFSSearch("Power Stone");
    }
}
