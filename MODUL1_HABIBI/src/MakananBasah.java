// Don't delete any comments below!!!
public class MakananBasah {
    private String bahan;
    private String nama;
    private int jumlah;
    private double harga;



    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
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

    public MakananBasah(String nama, int jumlah, double harga, String bahan) {
        this.bahan = bahan;
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public void tampilkanData(){
        System.out.println("Masukan Nama Makanan: " + nama);
        System.out.println("Masukan Jumlah Makanan: " + jumlah);
        System.out.println("Masukan Harga Makanan: " + harga);
        System.out.println("Masukan Brand Makanan: " + bahan);
    }
    // Todo : Create private attribute of MakananBasah (nama, jumlah, harga, and bahan)

    // Todo : Create Constructor of MakananBasah

    // Todo : Create Getter and Setter

    // Todo : Create Method ShowData

}
