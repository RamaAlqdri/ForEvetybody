package DWF19.Num2;



public class Main {
    public static void main(String[] args) {
        Queue data = new Queue();
        System.out.println("Sebelum Tahu Prioritas Kamu :) <3");
        data.enqueue("Aku", false);
        data.enqueue("Kamu", false);
        data.enqueue("Saya", false);
        data.enqueue("dia", false);
        data.enqueue("Bestiemu", false);
        data.printAll();
        System.out.println("\nSetelah Tahu Prioritas Kamu :(");
        data.enqueue("Kamu", true);
        data.enqueue("dia", true);
        data.priority();
        data.printAll();
    }
}
