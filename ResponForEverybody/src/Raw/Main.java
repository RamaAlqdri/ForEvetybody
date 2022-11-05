package Raw;

public class Main {
    public static void main(String[] args) {
        Queue data = new Queue();
        data.enqueue(1);
        data.enqueue(2);
        data.enqueue(3);
        data.enqueue(4);
        data.enqueue(5);

        data.printAll();
        System.out.println();
        System.out.println(data.dequeue());
    }
}
