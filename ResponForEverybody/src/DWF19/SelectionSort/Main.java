package DWF19.SelectionSort;
public class Main {
    public static void main(String[] args) {
        Doubly data = new Doubly();
        data.addLast(2);
        data.addLast(8);
        data.addLast(5);
        data.addLast(3);
        data.addLast(9);
        data.addLast(4);
        data.addLast(1);
        data.selectionSort();
    }
}
