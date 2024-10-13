package TPMODUL1_HABIBI;

public class Penerbangan {
    private final String nomorPenerbangan;
    private final String asal;
    private final String tujuan;
    private final String waktuBerangkat;
    private final String waktuTiba;
    private final int harga;

    public Penerbangan(String nomorPenerbangan, String asal, String tujuan, String waktuBerangkat, String waktuTiba, int harga) {
        this.nomorPenerbangan = nomorPenerbangan;
        this.asal = asal;
        this.tujuan = tujuan;
        this.waktuBerangkat = waktuBerangkat;
        this.waktuTiba = waktuTiba;
        this.harga = harga;
    }

    public void tampilDaftarPenerbangan() {
        System.out.println("Nomor penerbangan: " + nomorPenerbangan);
        System.out.println("Bandara Keberangkatan: " + asal + " ---> Bandara tujuan: " + tujuan);
        System.out.println("Waktu Keberangkatan: " + waktuBerangkat + " ---> Waktu Kedatangan: " + waktuTiba);
        System.out.printf("Harga tiket: Rp.%.1f%n", (float) harga);
        System.out.println();
    }
}

