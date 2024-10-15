// Don't delete any comments below!!!

public class Makanan {
    // Todo : Create private attribute of Makanan (nama, jumlah, and harga)
    private String nama;
    private int jumlah;
    private double harga;
    // Todo : Create Constructor of Makanan

    public Makanan(String nama, int jumlah, double harga){
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
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

    public void makanan(){
        System.out.println("Masukan Nama Makanan" + nama);
        System.out.println("Masukan Jumlah Makanan" + jumlah);
        System.out.println("Masukan Harga Makanan" + harga);
    }

    // Todo : Create Constructor of Makanan

    // Todo : Create Getter and Setter

}
