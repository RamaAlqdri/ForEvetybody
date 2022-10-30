package DWF19.Num1;
public class DoubleLinkedList {
    private class Node{
        String Nama;
        int Height;
        Node(String Nama, int Height){
            this.Nama=Nama;
            this.Height=Height;
        }
        Node next;
        Node previous;
    }
    Node head = null;
    Node tail = null;
    public void addLast(String Nama, int Height){
        if (head==null){
            head = tail = new Node(Nama, Height);
            head.previous=null;
            tail.next=null;
        }else{
            Node temp = new Node(Nama, Height);
            tail.next=temp;
            temp.previous=tail;
            tail=temp;
            tail.next=null;
        }
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
    public boolean isAvailable(String ParamName){
        Node current = head;
        boolean available =false;
        for (int i=0;i<getDataSize();i++){
            if (current.Nama==ParamName){
                return true;
            }
            current=current.next;
        }
        return available;
    }
    public void deleteFirst(){
        head=head.next;
        head.previous=null;
    }
    public void deleteLast(){
        tail=tail.previous;
        tail.next=null;
    }
    public void deleteByValue(String Paramname){
        if (isAvailable(Paramname)){
            System.out.println("data tidak ditemukan");
        }else {
            if (getDataSize()==1){
                head=null;
            }else if (Paramname.equals(head.Nama)){
                deleteFirst();
            }else if(Paramname.equals(tail.Nama)){
                deleteLast();
            }else {
                Node current = head;
                Node temp;
                Node temp2;
                while (current.next!=null) {
                    if (Paramname.equals(current.Nama)){
                        temp = current.previous;
                        temp2 = current.next;
                        temp.next=temp2;
                        temp2.previous=temp;
                    }
                    current = current.next;
                }
            }
        }
    }
    public void Swap(String Name1, String Name2){
        String tempname  = "";
        int tempHeight = 0;
        int tempPower = 0;
        String tempname2  = "";
        int tempHeight2 = 0;
        Node current = head;
        for (int i = 0; i<getDataSize();i++){
            if (Name1.equals(current.Nama)){
                tempname = current.Nama;
                tempHeight = current.Height;
            }
            else if (Name2.equals(current.Nama)){
                tempname2 = current.Nama;
                tempHeight2 = current.Height;
            }
            current = current.next;
        }
        current=head;
        for (int i = 0; i<getDataSize();i++){
            if (Name1.equals(current.Nama)){
                current.Nama=tempname2;
                current.Height=tempHeight2;
            }
            else if (Name2.equals(current.Nama)){
                current.Nama = tempname;
                current.Height = tempHeight;
            }
            current = current.next;
        }
    }

    public void printAll(){
        Node current = head;
        while (current!=null){
            System.out.println("Nama : "+ current.Nama+", Height : "+current.Height+"cm");
            current=current.next;
        }
        System.out.println();
    }
    public void printReverse(){
        Node current = tail;
        while (current!=null){
            System.out.println("Nama : "+ current.Nama+", Height : "+current.Height+"cm");
            current=current.previous;
        }
        System.out.println();
    }
}