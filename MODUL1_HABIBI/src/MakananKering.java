// Don't delete any comments below!!!

public class MakananKering {
    private String brand;
    private String nama;
    private int jumlah;
    private double harga;



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public MakananKering(String nama, int jumlah, double harga, String brand) {
        this.brand = brand;
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public void tampilkanData(){
        System.out.println("Masukan Nama Makanan: " + nama);
        System.out.println("Masukan Jumlah Makanan: " + jumlah);
        System.out.println("Masukan Harga Makanan: " + harga);
        System.out.println("Masukan Brand Makanan: " + brand);
    }

    


    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)

    // Todo : Create Constructor of MakananKering

    // Todo : Create Getter and Setter

    // Todo : Create Method ShowData

}
