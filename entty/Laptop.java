package entty;

/**
 * Laptop
 */
public class Laptop {
    private String id_laptop;
    private String nama;
    private String stok;
    private String brand;
    private String tipe;

    public Laptop() {
    }

    public Laptop(String id_laptop, String nama, String brand, String tipe, String stok) {
        this.id_laptop = id_laptop;
        this.nama = nama;
        this.stok = stok;
        this.brand = brand;
        this.tipe = tipe;
    }

    public String getId_laptop() {
        return this.id_laptop;
    }

    public void setId_laptop(String id_laptop) {
        this.id_laptop = id_laptop;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStok() {
        return this.stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTipe() {
        return this.tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Laptop)) {
            return false;
        }
        Laptop laptop = (Laptop) o;
        return id_laptop.equals(laptop.getId_laptop());
    }

}