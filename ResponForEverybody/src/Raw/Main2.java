package Raw;

public class Main2 {
    public static void main(String[] args) {
        Stack data = new Stack();
        data.push(1);
        data.push(2);
        data.push(3);
        data.push(4);
        data.push(5);
        data.printAll();
        System.out.println();
        System.out.println(data.pop());
    }
}
