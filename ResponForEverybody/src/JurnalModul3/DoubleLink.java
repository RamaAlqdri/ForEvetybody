package JurnalModul3;

public class DoubleLink {
    private class Node{
        String Nama;
        int Harga;
        int Stok;
        Node(String Nama, int Harga, int Stok){
            this.Nama=Nama;
            this.Harga=Harga;
            this.Stok=Stok;
        }
        Node next;
        Node previous;
    }
    Node head = null;
    Node tail = null;
    public void addLast(String Nama, int Harga, int Stok){
        if (head==null){
            head = tail = new Node(Nama,Harga,Stok);
            head.previous=null;
            tail.next=null;
        }else{
            Node temp = new Node(Nama,Harga,Stok);
            tail.next=temp;
            temp.previous=tail;
            tail=temp;
            tail.next=null;
        }
    }
    public void bubbleSort(int n){
        Node current = head;
        Node current2 = head.next;
        if (n==1){
            return;
        }
        for (int i=0; i<n-1;i++){
            if (current.Nama.charAt(0)>current2.Nama.charAt(0)){
                Swap(current.Nama, current2.Nama);
            }
            current = current.next;
            current2 = current2.next;
        }
        bubbleSort(n-1);
    }
    public void Swap(String Name1, String Name2){
        String tempname  = "";
        int tempHarga = 0;
        int tempStok = 0;
        String tempname2  = "";
        int tempHarga2 = 0;
        int tempStok2 = 0;
        Node current = head;
        for (int i = 0; i<getDataSize();i++){
            if (Name1 == current.Nama){
                tempname = current.Nama;
                tempHarga = current.Harga;
                tempStok = current.Stok;
            }
            else if (Name2 == current.Nama){
                tempname2 = current.Nama;
                tempHarga2 = current.Harga;
                tempStok2 = current.Stok;
            }
            current = current.next;
        }
        current=head;
        for (int i = 0; i<getDataSize();i++){
            if (Name1 == current.Nama){
                current.Nama=tempname2;
                current.Harga=tempHarga2;
                current.Stok=tempStok2;
            }
            else if (Name2 == current.Nama){
                current.Nama=tempname;
                current.Harga=tempHarga;
                current.Stok=tempStok;
            }
            current = current.next;
        }
    }
    public Node getNode(int n){
        Node current = head;
        for (int i=0;i<getDataSize();i++){
            if (i==n){
                break;
            }else{
                current=current.next;
            }
        }
        return current;
    }
    public void geserNode(int index,int index1){
        for (int i = index1;i>=index;i--){
            if(i-1<0){
                break;
            }else{
                Swap(getNode(i).Nama,getNode(i-1).Nama);
            }
        }
    }
    public void insertionSort(int n){
        Node current = head;
        if (n==0){
            return;
        }
        for (int i=0;i<=n-1;i++){
            if(getNode(n-1).Harga>current.Harga){
                geserNode(i,n-1);
            }
            current=current.next;
        }
        insertionSort(n-1);
    }
    Node split(Node head){
        Node fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node temp = slow.next;
        slow.next = null;
        return temp;
    }
    Node mergeSort(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node second = split(node);
        node = mergeSort(node);
        second = mergeSort(second);
        return merge(node, second);
    }
    Node merge(Node first, Node second) {
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }
        if (first.Stok < second.Stok) {
            first.next = merge(first.next, second);
            first.next.previous = first;
            first.previous = null;
            return first;
        } else {
            second.next = merge(first, second.next);
            second.next.previous = second;
            second.previous = null;
            return second;
        }
    }
    public void sequentialSearch(String param){
        Node current = head;
        if (isAvailable(param)==false){
            System.out.println("Barang Tidak Ditemukan");
        }else{
            for (int i=0;i<getDataSize();i++){
                if (current.Nama.equals(param)){
                    System.out.println("===Barang Ditemukan===");
                    System.out.println("Nama:\t"+ param);
                    System.out.print("Letak: ");
                    if (current.Nama==head.Nama){
                        System.out.println("Sebelum "+current.next.Nama);
                    }else if(current.Nama==tail.Nama){
                        System.out.println("Setelah "+current.previous.Nama);
                    }else{
                        System.out.println("\tSebelum "+current.next.Nama);
                        System.out.println("\t\tSetelah "+current.previous.Nama);
                    }
                    break;
                }else{
                    current=current.next;
                }
            }
        }
    }
    static Node middleNode(Node start, Node last){
        if (start == null)return null;
        Node slow = start;
        Node fast = start.next;
        while (fast != last)
        {
            fast = fast.next;
            if (fast != last)
            {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }
    public void searchBinary(String key) {
        int found = binaryMethod(0, getDataSize(), key);
        if (found >= 0) {
            System.out.println("===== Barang Ditemukan ====");
            System.out.println("Nama Barang : " + getNode(found).Nama);
            System.out.print("Letak : ");
            if (found == 0)
                System.out.println("Sebelum barang " + getNode(found + 1).Nama);
            else if (found == getDataSize() - 1)
                System.out.println("Setelah barang " + getNode(found - 1).Nama);
            else {
                System.out.println("Sebelum barang " + getNode(found + 1).Nama);
                System.out.println("\t\tSetelah barang " + getNode(found - 1).Nama);
            }
            return;
        }
        System.out.println("===== Barang Tidak Ditemukan ====");
    }

    private int binaryMethod(int low, int high, String key) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            if (key.equalsIgnoreCase(getNode(mid).Nama))
                return mid;

            if (key.compareToIgnoreCase(getNode(mid).Nama) < 0)
                return binaryMethod(low, mid - 1, key);

            return binaryMethod(mid + 1, high, key);
        }
        return -1;
    }
    public boolean isAvailable(String Nama){
        Node current = head;
        boolean cek=false;
        for (int i=0;i<getDataSize();i++){
            if (current.Nama.equals(Nama)){
                cek=true;
                break;
            }
            current=current.next;
        }
        return cek;
    }
    public int getDataSize(){
        int count=0;
        Node current = head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    public void printAll(){
        Node current = head;
        while (current!=null){
            System.out.print("Nama : "+ current.Nama);
            System.out.print(", Harga : Rp."+ current.Harga);
            System.out.println(", Stok : "+ current.Stok);
            current=current.next;
        }
        System.out.println();
    }
}

