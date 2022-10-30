package DWF19.Num1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList data = new DoubleLinkedList();
        MainMenu(data);
    }
    public static void MainMenu(DoubleLinkedList data){
        int choice = 0;
        String tempName;
        String tempName2;
        int tempHeight;
        System.out.println("=======================================");
        System.out.println("|                Menu                 |");
        System.out.println("=======================================");
        System.out.println("1. Masukkan Data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Print Data");
        System.out.println("4. Print Data Reverse");
        System.out.println("5. Tukar Data");
        System.out.println("6. Keluar");
        System.out.print("Masukkan Pilihan: ");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        switch (choice){
            case 1 :
                System.out.print("Masukkan Nama: ");
                tempName=input.next();
                System.out.print("Masukkan Tinggi: ");
                tempHeight=input.nextInt();
                data.addLast(tempName,tempHeight);
                MainMenu(data);
                break;
            case 2 :
                System.out.print("Masukkan Nama: ");
                tempName=input.next();
                data.deleteByValue(tempName);
                MainMenu(data);
                break;
            case 3 :
                data.printAll();
                MainMenu(data);
                break;
            case 4 :
                data.printReverse();
                MainMenu(data);
                break;
            case 5 :
                System.out.print("Masukkan Nama Pertama: ");
                tempName = input.next();
                System.out.print("Masukkan Nama Kedua: ");
                tempName2 = input.next();
                data.Swap(tempName,tempName2);
                MainMenu(data);
                break;
            case 6 :
                return;
            default:
                MainMenu(data);
                break;
        }

    }
}
