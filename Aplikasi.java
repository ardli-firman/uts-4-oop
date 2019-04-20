import srvc.*;
import java.util.*;
import entty.*;

/**
 * Aplikasi
 */
public class Aplikasi {

    private static ServiceStok srvc;
    private static Scanner scanner;

    public static void main(String[] args) {
        srvc = new ServiceStok();
        int opsi = 5;
        do {
            cetakMenu();
            scanner = new Scanner(System.in);
            try {
                opsi = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Tolong cek kembali inputan anda");
                opsi = 0;
            }
            prosesMenu(opsi);
        } while (opsi != 5);
    }

    private static void prosesMenu(int opsi) {
        switch (opsi) {
        case 1:
            tambahData();
            break;
        case 2:
            formUbahData();
            break;
        case 3:
            formHapusData();
            break;
        case 4:
            srvc.cetakData();
            break;
        }
    }

    private static void formHapusData() {
        System.out.println("\nForm Hapus Data");
        scanner = new Scanner(System.in);
        System.out.print("ID Laptop\t: ");
        String id_laptop = scanner.nextLine();
        srvc.hapusData(id_laptop);
    }

    private static void formUbahData() {
        String id_laptop, nama, brand, tipe, stok;
        System.out.println("\nForm Ubah Data");
        scanner = new Scanner(System.in);
        System.out.print("ID Laptop\t: ");
        id_laptop = scanner.nextLine();
        System.out.print("Nama\t\t: ");
        nama = scanner.nextLine();
        System.out.print("Brand\t\t: ");
        brand = scanner.nextLine();
        System.out.print("Tipe\t\t: ");
        tipe = scanner.nextLine();
        System.out.print("Stok\t\t: ");
        stok = scanner.nextLine();
        srvc.ubahData(new Laptop(id_laptop, nama, brand, tipe, stok));
    }

    private static void tambahData() {
        String id_laptop, nama, brand, tipe, stok;
        System.out.println("\nForm Tambah Data");
        scanner = new Scanner(System.in);
        System.out.print("ID Laptop\t: ");
        id_laptop = scanner.nextLine();
        System.out.print("Nama\t\t: ");
        nama = scanner.nextLine();
        System.out.print("Brand\t\t: ");
        brand = scanner.nextLine();
        System.out.print("Tipe\t\t: ");
        tipe = scanner.nextLine();
        System.out.print("Stok\t\t: ");
        stok = scanner.nextLine();
        simpanDataBaru(new Laptop(id_laptop, nama, brand, tipe, stok));
    }

    private static void simpanDataBaru(Laptop lptp) {
        srvc.tambahData(lptp);
    }

    private static void cetakMenu() {
        System.out.println("===> Aplikasi CRUD Stok Laptop <===");
        System.out.println("1. Tambah data laptop");
        System.out.println("2. Ubah data laptop");
        System.out.println("3. Hapus data laptop");
        System.out.println("4. Tampilkan data laptop");
        System.out.println("5. Keluar");
        System.out.println("----------------------------------");
        System.out.print("Pilihan > ");
    }
}