package JurnalModul3;
// memasukan library scanner yang berfungsi untuk membuat object atau
// menginisialisasikan object yang diinginkan pengguna atau diinputkan pengguna
import java.util.Scanner;
//membuat class main untuk melakukan fungsi utama
public class Main2 {
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
        // mencetak keterangan urutkan berdasarkan nama  dengan sintaks System.out.println
        System.out.println("Urutkan Berdasarkan Nama:");
        data.bubbleSort(data.getDataSize());
        //// mencetak semua data yang berada di dalam sebuah node
        data.printAll();
        // mengconstruc class scanner dengan object input yang digunakan untuk menginputkan data dari user
        Scanner input = new Scanner(System.in);
        // membuat variabel untuk menyimpan object input user
        String Param;
        System.out.print("Masukkan Nama Barang: ");
        // berfungsi untuk menangkap inputan user dan memasukkannya kedalam variable param denga tipe string atau line
        Param=input.nextLine();
        // melakukan pencarian data menggunakan funtion squentialsearch untuk
        // mencari value di dalam node list apakah sesuai dengan parameter param
        data.sequentialSearch(Param);

        System.out.print("Masukkan Nama Barang: ");
        // berfungsi untuk menangkap inputan user dan memasukkannya kedalam variable param denga tipe string atau line
        Param=input.nextLine();
        // melakukan pencarian data menggunakan funtion searchBinary untuk
        // mencari value di dalam node list apakah sesuai dengan parameter param
        data.searchBinary(Param);

        System.out.print("Masukkan Nama Barang: ");
        // berfungsi untuk menangkap inputan user dan memasukkannya kedalam variable param denga tipe string atau line
        Param=input.nextLine();
        // melakukan pencarian data menggunakan funtion squentialsearch untuk
        // mencari value di dalam node list apakah sesuai dengan parameter param
        data.sequentialSearch(Param);

        System.out.print("Masukkan Nama Barang: ");
        // berfungsi untuk menangkap inputan user dan memasukkannya kedalam variable param denga tipe string atau line
        Param=input.nextLine();
        // melakukan pencarian data menggunakan funtion searchBinary untuk
        // mencari value di dalam node list apakah sesuai dengan parameter param
        data.searchBinary(Param);

    }
}
