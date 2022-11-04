package ResponModul2;

public class Main {
    public static void main(String[] args) {
        Queue data = new Queue();
        data.dequeue();
        data.enqueue("Robert", 183);
        data.enqueue("Joestar", 172);
        data.enqueue("Sumbul", 165);
        data.enqueue("Martinez", 169);
        data.enqueue("Dio Brando", 160);
        System.out.println(data.dequeue().Nama + " di-dequeue");
        data.dequeueAll();
    }
}
