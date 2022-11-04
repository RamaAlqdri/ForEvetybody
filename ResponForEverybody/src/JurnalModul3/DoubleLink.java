package JurnalModul3;

// membuat class DoubleLink yang digunakan untuk menyimpan node dan operasi
//operasi dari DoubleLink
public class DoubleLink {
    //membuat class node yang nantinya digunakan untuk menyimpan value dari DoubleLinkedlist
// dengan visibility private agar class node hanya bisa digunakan di class DoubleLink
    private class Node{
        //Mendeklarasikan variable yang digunakan untuk menyimpan nama barang dengan tipe data String
        String Nama;
        //Mendeklarasikan variable yang digunakan untuk menyimpan harga barang dengan tipe data Integer
        int Harga;
        //Mendeklarasikan variable yang digunakan untuk menyimpan stok barang dengan tipe data Integer
        int Stok;
        // berfungsi untuk melakukan constructor yang digunakan untuk menginisialisasikan
        // value dari variabel nama, harga dan stok hanya dengan menconstruc
        // class node constructor digunakan untuk memberikan nilai awal pada
        // objek pada saat dibuat
        Node(String Nama, int Harga, int Stok){
            // this berfungsi untuk merujuk kepada object atau variabel yang
            // berada pada class node bukan bukan merujuk pada variabel yang
            // terdapat di parameter constructor Node untuk menghindari variabel
            // tersebut mengisi variabel itu sendiri

            // berfungsi untuk mengisi variabel nama yang ada pada class node dengan
            // menggunakan value variabel nama dari parameter
            this.Nama=Nama;
            // berfungsi untuk mengisi variabel harga yang ada pada class node dengan
            // menggunakan value variabel harga dari parameter
            this.Harga=Harga;
            // berfungsi untuk mengisi variabel stok yang ada pada class node dengan
            // menggunakan value variabel stok dari parameter
            this.Stok=Stok;
        }
        // mendeklarasikan variabel next dengan tipe data atau class Node didalam class
        // itu sendiri yang berfungsi untuk mengakses atau merujuk ke data atau node selanjutnya
        Node next;
        // mendeklarasikan variabel next previous tipe data atau class Node didalam class
        // itu sendiri yang berfungsi untuk mengakses atau merujuk ke data atau node sebelumnya
        Node previous;
    }
    // mendeklarasikan variabel head dengan tipe data node yang berfungsi menandai
    // data sebagai data pertama menginisialisasikan variabel head dengan null untuk
    // menandakan bahwa data awal atau data dari list masih kosong
    Node head = null;
    // mendeklarasikan variabel tail dengan tipe data node yang berfungsi menandai
    // data sebagai data terakhir menginisialisasikan variabel tail dengan null
    // untuk menandakan bahwa data akhir masih kosong
    Node tail = null;
    // membuat function addLast yang berfungsi untuk menambahkan data diakhir dari
    // list dengan parameter string nama, integer tinggi integer power, tipe void
    // dari function dikarenakan function tersebut hanya melakukan proses menambahkan data akhir
    // tanpa perlu mengembalikan data tertentu
    public void addLast(String Nama, int Harga, int Stok){
        // membuat suatu kondisi if yang digunakan untuk mengecek apakah data di list sudah terdapat data atau belum
        // dengan kondisi apakah head==null
        if (head==null){
            // jika belum ada data sama sekali atau head == null maka akan membuat data pertama dengan menconsruc class Node yang berisi
            //  parameter dari parameter function addlast yang dimana berarti data pertama tersebut merupakan data awal/ head dan juga
            //  merupakan data akhir/tail,
            head = tail = new Node(Nama,Harga,Stok);
            // karena ini merupakan double linked list yang dimana tidak ada data sebelum data awal dan tidak ada data setelah data akhir
            // maka pada variabel head yang merujuk ke data sebelumnya dari si head dengan menggunakan variabel previous yang dihubungkan
            // dengan tanda titik sama dengan null atau himpunan kosong
            head.previous=null;
            // lalu pada variabel tail yang merujuk ke data setelah dari si tail dengan menggunakan variabel next yang dihubungkan
            // dengan tanda titik sama dengan null atau himpunan kosong
            tail.next=null;
            // kemudian jika kondisi pertama tidak terpenuhi maka dalam list tersebut sudah terdapat suatu data, maka program akan mengeksekusi
            // kondisi di else
        }else{
            // membuat variabel temp dengan tipe data node yang berfungsi untuk menyimpan data baru dengan menconstructor class node tersebut
            Node temp = new Node(Nama,Harga,Stok);
            // karena function ini berfungsi untuk menambahkan data diakhir jadi pada data akhir atau tail dari list tersebut ditambahkan data baru
            // setelah data tail dengan tail merujuk pada variabel next sama dengan data baru atau temp
            tail.next=temp;
            // setelah data setelah tail merujuk pada data baru dengan penunjuk previousnya juga harus merujuk pada tail
            temp.previous=tail;
            // setelah tail penunjuk nextnya merujuk pada data baru atau temp maka databaru tersebut menjadi data terakhir, supaya
            // tail dijadikan data terakhir kembali maka tail sama dengan data baru atau temp;
            tail=temp;
            // karena tail adalah data terakhir maka tail penunjuk next haru sama dengan kosong atau null
            tail.next=null;
        }
    }
    // Membuat fungsi untuk mengurutkan list dengan metode bubble sort
    // bubbleSort adalah pengurutan data yang dilakukan dengan membandingkan
    // antara data [n] dengan data [n+1] atau antara data [n] dengan
    // data [n-1] kemudian jika data lebih kecil/besar dilakukan pertukaran.
    // Pada setiap iterasi dapat terjadi beberapa kali pertukaran atau tidak sama sekali
    public void bubbleSort(int n){
        // menginisialisaikan nilai current sama dengan head
        Node current = head;
        // menginisialisaikan nilai current sama dengan data setelah head
        Node current2 = head.next;
        // membuat kondisi untuk menghentikan rekursif funtion
        // dengan kondisi n sama dengan 1
        if (n==1){
            return;
        }
        // melakukan perulangan for untuk mengecek karakter awal
        //  dari string current dan current2
        for (int i=0; i<n-1;i++){
            // jika memenuhi kondisi current lebih besar daripada current2 maka
            // value dari current dan current2 akan ditukar menggunakan function swap
            //dengan parameter setiap nama dari curent dan current2
            if (current.Nama.charAt(0)>current2.Nama.charAt(0)){
                Swap(current.Nama, current2.Nama);
            }
            // untuk memeriksa data selanjutnya maka variable current
            // akan merujuk ke data setelahnya
            current = current.next;
            // untuk memeriksa data selanjutnya maka variable current2
            // akan merujuk ke data setelahnya
            current2 = current2.next;
        }
        // kemudian memanggil fungsi itu sendiri atau rekurfif function dengan parameter n-1
        bubbleSort(n-1);
    }
    // sebuah fungsi untuk menukar value dari node-node dengan parameter
    // nama dari node itu sendiri untuk membedakan setiap node
    public void Swap(String Name1, String Name2){
        // mendeklarasikan variable tempname untuk menyimpan nama barang sementara
        String tempname  = "";
        String tempname2  = "";
        // mendeklarasikan variable tempname untuk menyimpan harga barang sementara
        int tempHarga2 = 0;
        int tempHarga = 0;
        // mendeklarasikan variable tempname untuk menyimpan stok barang sementara
        int tempStok = 0;
        int tempStok2 = 0;
        // menginisialisaikan nilai current sama dengan head
        Node current = head;
        // melakukan perulangan for untuk mencari string dari parameter nama1 dan nama2
        //apakaah terdapat dalam list 1 dan list 2
        for (int i = 0; i<getDataSize();i++){
            // membuat kondisi untuk ketika nama1 ditemukan di list maka semua value
            // dari cureent akan disimpan di temp
            if (Name1 == current.Nama){
                tempname = current.Nama;
                tempHarga = current.Harga;
                tempStok = current.Stok;
            }
            // jika kondisi if tidak ditemukan maka memriksa apakah  nama2 ditemukan di list
            // maka semua value dari cureent akan disimpan di temp
            else if (Name2 == current.Nama){
                tempname2 = current.Nama;
                tempHarga2 = current.Harga;
                tempStok2 = current.Stok;
            }
            // untuk memeriksa data selanjutnya maka variable current
            // akan merujuk ke data setelahnya
            current = current.next;
        }
        // mengembalikan kembali variabel current ke head
        current=head;
        // kemudian melakukan perulangan kembali
        for (int i = 0; i<getDataSize();i++){
            if (Name1 == current.Nama){
                //kemudian menyimpan semua value dari variabel sementara yang sudah ditemukan ke data saat ini
                current.Nama=tempname2;
                current.Harga=tempHarga2;
                current.Stok=tempStok2;
            }
            else if (Name2 == current.Nama){
                // kemudian menyimpan semua value dari variabel sementara2 yang sudah ditemukan ke data saat ini
                current.Nama=tempname;
                current.Harga=tempHarga;
                current.Stok=tempStok;
            }
            // kemudian berpindah ke data selanjuntya dengan menginisialisasikan variabel current dengan current dengan penunjuk nextnya
            current = current.next;
        }
    }
    // membuat function untuk mendapatkan variable node dengan menggunakan parameter indeks dari node tersebut
    public Node getNode(int n){
        // membuat variabel yang berfungsi sebagai pointer yang merujuk pada data pertama atau head
        Node current = head;
        // membuat perulangan for untuk mengecek apakah indeks
        // saat ini (i) sama dengan indeks dari parameter 👎
        for (int i=0;i<getDataSize();i++){
            // kondisi jika variabel saat ini atai i sama dengan n maka perulangan dihentikan dengan sintaks break
            if (i==n){
                break;
                // jika kondisi tidak terpenuhi maka berpindah ke data selanjuntnya
                // dengan menginisialisasikan variabel current dengan current dengan penunjuk nextnya
            }else{
                current=current.next;
            }
        }
        // mengembalikan nilai current
        return current;
    }
    // membuat funtion untuk menggeser sebuah node dengan batasan awal indeks
    // dan batasan akhir indeks1 yang nantinya semua node setelah indeks dan node sebelum indeks1 akan digeser dan
    // node dari indeks1 akan dipindahkan sebelum node indeks
    public void geserNode(int index,int index1){
        //melakukan perulangan for decrement yang dimana variabel i sama dengan indeks1
        // dengan kondisi i lebih dari sama dengan indeks
        for (int i = index1;i>=index;i--){
            // membuat kondisi untuk mencegah variable merujuk ke null dengan syarat
            // i dikurangi satu tidak boleh sama dengan 0
            if(i-1<0){
                break;
                // jika kondisi diatas tidak terpenuhi maka melakukan pertukaran
                //value node menggunakan function swap dengan parameter indeks fuction getnode
                // berdasarkan indeks i merujuk ke nama dengan node sebelum indeks i
            }else{
                Swap(getNode(i).Nama,getNode(i-1).Nama);
            }
        }
    }
    //  Membuat fungsi untuk mengurutkan list dengan metode insertionSort
    //  insertion sort merupakan sebuah teknik pengurutan dengan cara
    //  membandingkan mengurutkan dua data pertama pada node,
    //  kemudian membandingkan data berikutnya pada node
    //  apakah sudah berada di tempat semestinya.
    public void insertionSort(int n){
        // menginisialisaikan nilai current sama dengan head
        Node current = head;
        // membuat kondisi untuk menghentikan rekursif funtion
        // dengan kondisi n sama dengan 0
        if (n==0){
            return;
        }
        // melakukan perulangan for untuk menggeser node dengan kondisi
        // apakah getnode n-1 penunjuk harganya lebih besar dari current.harga
        // jika iya maka akan melakukan geser node dengan parameter variabel i dan n-1
        for (int i=0;i<=n-1;i++){
            if(getNode(n-1).Harga>current.Harga){
                geserNode(i,n-1);
            }
            // kemudian berpindah ke data selanjuntya dengan menginisialisasikan variabel current dengan current dengan penunjuk nextnya
            current=current.next;
        }
        // // kemudian memanggil fungsi itu sendiri atau rekurfif function dengan parameter n-1
        insertionSort(n-1);
    }
    // membuat method untuk memecah list menjadi dua dengan parameter node
    Node split(Node head){
        // membuat variable penanda bagian split1 dan bagian split2 dengan inisialisasi awal yaitu head
        Node fast = head, slow = head;
        // sebelum memecah dua buah list perlu melakukan perulangan while
        // untuk mencari node tengah dari list
        while (fast.next != null && fast.next.next != null) {
            // agar mendapat nilai tengah maka variabel split pertama dua kali lebih depan daripada split kedua
            fast = fast.next.next;
            slow = slow.next;
        }
        // ketika variable tengah telah ditemukan selanjuntya memecah list dengan
        // menggunakan variable node temporary dengan value variable split2.next
        Node temp = slow.next;
        slow.next = null;
        // mengambil nilai temporary
        return temp;
    }
    // membuat function untuk mengurutkan dengan metode mergeSort
    // mergeSort merupakan metode pengurutan data yang dilakukan dengan
    // memecah penampung elemen menjadi dua dampai tersisa hanya menjadi
    // satu partisi, kemudian mengiterasi dengan membandingkan dan menggabungkan secara berulang
    Node mergeSort(Node node) {
        // membuat kondisi untuk rekursif apabila node sama dengan null atau node selanjutnya sama dengan null
        // maka mengembalikan nilai node
        if (node == null || node.next == null) {
            return node;
        }
        // membuat list atau list baru dengan memecah node parameter
        Node second = split(node);
        // menggabungkan banyak list yang telah dipecah menjadi satu partisi1
        node = mergeSort(node);
        // menggabungkan banyak list yang telah dipecah menjadi satu partisi2
        second = mergeSort(second);
        // mengembalikan nilai merge dengan menggabungkan kedua buah partisi1 dan partisi2
        return merge(node, second);
    }
    // membuat function untuk menggabungkan dua buah node
    //dengan parameter node first dan node second
    Node merge(Node first, Node second) {
        // membuat suatu kondisi if yang digunakan untuk mengecek apakah data di list first, null atau tidak
        if (first == null) {
            // jika list pertama tidak ada otomatis mengambil nilai dari second
            return second;
        }
        // membuat suatu kondisi if yang digunakan untuk mengecek apakah data di list second, null atau tidak
        if (second == null) {
            // jika list pertama tidak ada otomatis mengambil nilai dari second
            return first;
        }
        // membuat suatu kondisi jika list pertama dengan value stoknya lebih kecil daripada value stok kedua
        // maka data setelah list pertama sama dengang gabungan dari list pertama dan list kedua
        //dengan menggunakan function merge dengan parameter data setelah list pertama dan datalist kedua
        if (first.Stok < second.Stok) {
            first.next = merge(first.next, second);
            //data gabungan tersebut dijadikan list pertama dan mengenullkan data sebelumnya
            first.next.previous = first;
            first.previous = null;
            return first;
            //jika kondisi diatas tidak terpenuhi maka data list kedua setelahnya sama dengan gabungan dari data list pertama daan list kedua
            //dengan menggunakan function merge dengan parameter list pertama dan data setelah list kedua
        } else {
            second.next = merge(first, second.next);
            //data gabungan tersebut dijadikan list kedua dan mengenullkan data sebelumnya
            second.next.previous = second;
            second.previous = null;
            return second;
        }
    }
    // Membuat fungsi untuk mencari value di dalam sebuah list dengan metode sequentialSearch
    // squential search merupakan sebuah algoritma untuk mencari sebuah nilai tertentu pada himpunan data
    // dengan cara memeriksa setiap elemen dari sebuah list sampai menemukan data yang ingin kita cari
    // searching ini membandingkan setiap elemen secara berurutan dimulai dari elemen tersebut dicari
    // detemukan bahkan diperiksa
    public void sequentialSearch(String param){
        // membuat variabel yang berfungsi sebagai pointer yang merujuk pada data pertama atau head
        Node current = head;
        // membuat kondisi untuk mengecek apakah string parameter tersebut  tidak ada di dalam list
        // jika tidak ada akan diberi peringatan
        if (isAvailable(param)==false){
            System.out.println("Barang Tidak Ditemukan");
            // jika kondisi diatas tidak terpenuhi akan dilakukan pengecekan secara berurutan
            // dari node pertama hingga node terakhir pada perulangan for
        }else{
            for (int i=0;i<getDataSize();i++){
                // kondisi jika value nama ditemukan pada node, selain node head dan tail
                // maka mencetak value nama yang ditemukan dan value nama data sebelum dan sesudah
                if (current.Nama.equals(param)){
                    System.out.println("===Barang Ditemukan===");
                    System.out.println("Nama:\t"+ param);
                    System.out.print("Letak: ");
                    // ketika value yang ditemukan berada di head maka cukup mencetak data yang ditemukan setelahnya
                    //menggunakan variabel current sebagai penunjuk next
                    if (current.Nama==head.Nama){
                        System.out.println("Sebelum "+current.next.Nama);
                        // ketika value yang ditemukan berada di tail maka cukup mencetak data yang ditemukan sebelumnya
                        // menggunakan variabel current sebagai penunjuk previous
                    }else if(current.Nama==tail.Nama){
                        System.out.println("Setelah "+current.previous.Nama);
                        // mencetak value nama  sebelum dan sesudah ditemukan dengan
                        //menggunakan variabel current sebagai penunjuk next dan previous
                    }else{
                        System.out.println("\tSebelum "+current.next.Nama);
                        System.out.println("\t\tSetelah "+current.previous.Nama);
                    }
                    break;
                    // berpindah ke data selanjuntya dengan menginisialisasikan variabel current dengan current dengan penunjuk nextnya
                }else{
                    current=current.next;
                }
            }
        }
    }
    // Membuat fungsi untuk mencari value di dalam sebuah list dengan metode binarySearch
    // Binary Search merupakan sebuah teknik pencarian data dengancara berulang kali
    // membagi separuh dari jumlah data yang dicari sampai sehingga
    // memperkecil lokasi pencarian menjadi satu data
    public void searchBinary(String key) {
        //menyimpan nilai kembalian dari fungsi binary method dengan parameter data awal atau indeks 0
        // kemudian banyak data atau gedatasize() dan string kata kunci
        int found = binaryMethod(0, getDataSize(), key);
        // membuat kondisi jika nilai found lebih dari sama dengan 0
        // berarti data dengan kata kunci telah ditemukan
        if (found >= 0) {
            // kemudian mencetak nama data dan posisi data sebelum dan sesudah
            System.out.println("===== Barang Ditemukan ====");
            System.out.println("Nama Barang : " + getNode(found).Nama);
            System.out.print("Letak : ");
            // dengan kondisi jika found == 0 maka hanya perlu mencetak data setelah node kata kunci
            if (found == 0)
                System.out.println("Sebelum barang " + getNode(found + 1).Nama);
                // jika found sama dengan indeks data terakhir mak perlu mencetak data sebelum node kata kunci
            else if (found == getDataSize() - 1)
                System.out.println("Setelah barang " + getNode(found - 1).Nama);
                // jika kondisi diatas tidak terpenuhi maka perlu mencetak data sebelum dan sesudah kata kunci
            else {
                System.out.println("Sebelum barang " + getNode(found + 1).Nama);
                System.out.println("\t\tSetelah barang " + getNode(found - 1).Nama);
            }
            return;
        }
        // jika data found kurang dari 0 maka data tidak ditemukan
        System.out.println("===== Barang Tidak Ditemukan ====");
    }
    // membuat fungsi yang menerapkan metode binary dengan tipe data integer
    // dengan parameter nilai awal,niali akhir dan string kata kunci
    private int binaryMethod(int low, int high, String key) {
        // membuat kondisi apakah nilai akhir lebih dari sama dengan nilai awal
        if (high >= low) {
            // jika iya maka mendapatkan indeks tengah dari list
            int mid = low + (high - low) / 2;
            // membuat kondisi untuk memeriksa apakah node tengah tersebut sama dengan parameter kata kunci
            if (key.equalsIgnoreCase(getNode(mid).Nama))
                // jika iya maka mengambil nilai middle atau tengah
                return mid;
            // membuat kondisi untuk membandingkan dua buah string apakah banyak karakter dari string karakter kata kunci
            // dan banyak karakter dari node mid.nama kurang dari 0
            if (key.compareToIgnoreCase(getNode(mid).Nama) < 0)
                // jika iya maka melakukan rekursif dengan mid dikurangi 1 atau melakukan pengecekan data sebelum mid
                return binaryMethod(low, mid - 1, key);
            // melakukan rekursif untuk mengecek data setelah mid
            return binaryMethod(mid + 1, high, key);
        }
        // ketika data tidak ditemukan maka nilai kembalian dari fungsi ini sama dengan -1
        return -1;
    }
    // method dengan tipe data boolean yang digunakan untuk memriksa apakah parameter string
    // apakah berada di dalam node node dari list
    public boolean isAvailable(String Nama){
        Node current = head;
        boolean cek=false;
        // melakukan perulangan for untuk memeriksa apakah parameter string nama sama dengan variabel currnent.nama
        // jika iya maka variabel cek sama dengan true dan mengakhiri perulangan
        // kemudian melakukan return cek
        for (int i=0;i<getDataSize();i++){
            if (current.Nama.equals(Nama)){
                cek=true;
                break;
            }
            // kemudian berpindah ke data selanjuntya dengan menginisialisasikan variabel current dengan current dengan penunjuk nextnya
            current=current.next;
        }
        return cek;
    }
    // method yang digunakan untuk mendapatkan ukuran atau besar dari data linked list
    public int getDataSize(){
        int count=0;
        Node current = head;
        // melakukan perulangan while daengan kondisi current tidak sama dengan null
        // jika kondisi terpenuhi maka melakukan increament pada variable count
        while(current!=null){
            count++;
            // kemudian berpindah ke data selanjuntya dengan menginisialisasikan variabel current dengan current dengan penunjuk nextnya
            current=current.next;
        }
        return count;
    }
    // membuat fungsi yang berfungsi untuk melakukan cetak atau print semua data dari linked list
    public void printAll(){
        // menginisialisaikan nilai current sama dengan head
        Node current = head;
        // melakukan perulangan menggunakan while yang kondisinya apakah current saat ini sama dengan kosong atau null
        while (current!=null){
            // jika kondisi while terpenuhi maka selanjutnya mencetak semua value
            // dari data current saat ini yang terdiri dari nama , harga dan stok
            System.out.print("Nama : "+ current.Nama);
            System.out.print(", Harga : Rp."+ current.Harga);
            System.out.println(", Stok : "+ current.Stok);
            // kemudian berpindah ke data selanjuntya dengan menginisialisasikan variabel current dengan current dengan penunjuk nextnya
            current=current.next;
        }
        System.out.println();
    }
}

