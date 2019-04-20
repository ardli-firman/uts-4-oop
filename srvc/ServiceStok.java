package srvc;

import entty.*;
import java.util.*;

/**
 * ServiceStok
 */
public class ServiceStok {
    private static List<Laptop> data = new LinkedList<Laptop>();

    public void tambahData(Laptop lptp) {
        ServiceStok.data.add(lptp);
        System.out.println("Data telah tersimpan\n");
    }

    public void ubahData(Laptop lptp) {
        int result = data.indexOf(lptp);
        if (result >= 0) {
            data.set(result, lptp);
            System.out.println("Data telah berubah\n");
        }
    }

    public void hapusData(String id_laptop) {
        int idx = data.indexOf(new Laptop(id_laptop, "", "", "", ""));
        if (idx >= 0) {
            data.remove(idx);
            System.out.println("Data telah terhapus\n");
        } else {
            System.out.println("Datanya memang tidak ada\n");
        }
    }

    public void cetakData() {
        System.out.println("------------ cetak data -----------");
        int i = 1;
        for (Laptop lptp : data) {
            System.out.println("Data Laptop ke - " + i++);
            System.out.println("ID Laptop\t: " + lptp.getId_laptop());
            System.out.println("Nama Laptop\t: " + lptp.getNama());
            System.out.println("Brand\t\t: " + lptp.getBrand());
            System.out.println("Tipe\t\t: " + lptp.getTipe());
            System.out.println("Jumlah stok\t: " + lptp.getStok());
            System.out.println("\n");
        }
    }
}