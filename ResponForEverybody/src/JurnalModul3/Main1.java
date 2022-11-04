package JurnalModul3;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("               DAFTAR BARANG");
        System.out.println("==============================================");
        DoubleLink data = new DoubleLink();
        data.addLast("Mizon", 6000, 30);
        data.addLast("Indomie Goreng", 3500, 8);
        data.addLast("Pulpy", 3000, 17);
        data.addLast("Indomie Soto", 3000, 12);
        data.addLast("Kopikap", 1500, 40);
        data.addLast("Nabati Coklat", 2000, 34);
        data.addLast("Nabati Permen Karet", 2000, 39);
        data.addLast("Kuda Mas Original", 1000, 77);
        data.printAll();
        System.out.println("Urutkan Berdasarkan Nama:");
        data.bubbleSort(data.getDataSize());
        data.printAll();
        System.out.println("Urutkan Berdasarkan Stok:");
        data.mergeSort(data.head);
        data.printAll();
        System.out.println("Urutkan Berdasarkan Harga:");
        data.insertionSort(data.getDataSize());
        data.printAll();

    }
}
