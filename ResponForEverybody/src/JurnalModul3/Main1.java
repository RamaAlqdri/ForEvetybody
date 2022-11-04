package JurnalModul3;

import java.util.Scanner;

//membuat class main untuk melakukan fungsi utama
public class Main1 {
    //  membuat fungsi main yang berfungsi untuk menjalankan program yang kita inginkan karena program
//  hanya akan mengeksekusi fungsi main
    public static void main(String[] args) {
        // mencetak keterangan daftar barang dengan sintaks System.out.println
        System.out.println("==============================================");
        System.out.println("               DAFTAR BARANG");
        System.out.println("==============================================");
        // mengconstruc class DoubleLink dengan nama object data dari class DoubleLink
        DoubleLink data = new DoubleLink();
        // selanjutnya memasukkan semua data nama, harga dan stok berdasarkan perintah soal
        // menggunakan fungsi addlast
        data.addLast("Mizon", 6000, 30);
        data.addLast("Indomie Goreng", 3500, 8);
        data.addLast("Pulpy", 3000, 17);
        data.addLast("Indomie Soto", 3000, 12);
        data.addLast("Kopikap", 1500, 40);
        data.addLast("Nabati Coklat", 2000, 34);
        data.addLast("Nabati Permen Karet", 2000, 39);
        data.addLast("Kuda Mas Original", 1000, 77);
        // mencetak semua data yang berada di dalam sebuah node
        data.printAll();
        System.out.println("Urutkan Berdasarkan Nama:");
        // digunakan untuk mengurutkan node node dari list data menggunakan metode bubblesort dengan patokan nama dari setiap node
        // dengan urutan ascending atau urutan terkecil terlebih dahulu dan menggunakan parameter
        // ukuran atau besar dari list data menggunakan method getDataSize()
        data.bubbleSort(data.getDataSize());
        // mencetak semua data yang berada di dalam sebuah node
        data.printAll();
        System.out.println("Urutkan Berdasarkan Stok:");
        // digunakan untuk mengurutkan node node dari list data menggunakan metode mergesort dengan patokan stok dari setiap node
        // dengan urutan ascending atau urutan terkecil terlebih dahulu dan menggunakan parameter variable node head dari list
        data.mergeSort(data.head);
        // mencetak semua data yang berada di dalam sebuah node
        data.printAll();
        System.out.println("Urutkan Berdasarkan Harga:");
        // digunakan untuk mengurutkan node node dari list data menggunakan metode insertionsort dengan patokan harga dari setiap node
        // dengan urutan descending atau urutan terbesar terlebih dahulu dan menggunakan parameter
        // ukuran atau besar dari list data menggunakan method getDataSize()
        data.insertionSort(data.getDataSize());
        // mencetak semua data yang berada di dalam sebuah node
        data.printAll();

    }
}
