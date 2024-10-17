// Don't delete any comments below!!!
// Todo: Import Scanner

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Todo : Create ManajemenInventaris Object and Scanner
        Scanner scanner = new Scanner(System.in);
        ManajemenInventaris manajemenInventaris = new ManajemenInventaris();
        
        // Todo : Create Loop list menu
        while(true){
            System.out.println("1. Tambah makanan kering");
            System.out.println("2. Tambah makanan Basah");
            System.out.println("3. Tampilkan semua makanan");
            System.out.println("4. Keluar");
            System.out.print("Masukan Pilihan Anda : ");
            String pilihan = scanner.nextLine();
        }
    }     
}
