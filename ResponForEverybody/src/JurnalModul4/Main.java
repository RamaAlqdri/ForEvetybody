package JurnalModul4;

public class Main {
    public static void main(String[] args) {
        BinaryTree data = new BinaryTree();
        data.insert("DAUS", 1);
        data.insert("PUTRI", 2);
        data.insert("DADEN", 3);
        data.insert("ARI", 4);
        data.insert("LILUL", 5);
        data.insert("ARSAN", 6);
        data.insert("JIDAN", 7);
        data.insert("UNO", 8);
        data.insert("SHAFA", 9);
        data.insert("DIAZ", 10);
        data.insert("MELKI", 11);
        data.insert("MAHEN", 12);
        data.insert("ALITA", 13);
        data.insert("ROZAKI", 14);
        data.insert("AGUNG", 15);

        System.out.print("\n=========================================");
        System.out.println("\n              Hubungan");
        System.out.print("=========================================\n");
        data.relationOf(2,1);
        data.relationOf(9,1);
        data.relationOf(12,13);
        data.relationOf(12,8);
        data.relationOf(5,1);
        data.relationOf(11,3);
        data.relationOf(14,6);
        data.relationOf(14,4);
        data.relationOf(10,15);

        System.out.print("\n=========================================");
        System.out.println("\n              Pre-Order");
        System.out.print("=========================================");
        System.out.println("\nParent : Child");
        data.printPreorder();

        System.out.print("\n=========================================");
        System.out.println("\n              In-Order");
        System.out.print("=========================================");
        System.out.println("\nParent : Child");
        data.printInorder();

        System.out.print("\n=========================================");
        System.out.println("\n             Post-Order");
        System.out.print("=========================================");
        System.out.println("\nParent : Child");
        data.printPostorder();
    }
}