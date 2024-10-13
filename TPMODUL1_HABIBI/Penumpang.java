package TPMODUL1_HABIBI;

public class Penumpang {
    private final String nik;
    private final String namaDepan;
    private final String namaBelakang;
    private Penerbangan penerbangan;

    public Penumpang(String nik, String namaDepan, String namaBelakang) {
        this.nik = nik;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    public void setPenerbangan(Penerbangan penerbangan) {
        this.penerbangan = penerbangan;
    }

    public Penerbangan getPenerbangan() {
        return penerbangan;
    }

    public void tampilDaftarPenumpang() {
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + namaDepan + " " + namaBelakang);
    }
}
