
public class Main {
    public static void main(String[] args) {
        Hewan hewanUmum = new Hewan("Hewan", 4);
        System.out.println("\nInformasi Hewan:");
        hewanUmum.suara();
        hewanUmum.makan();
        hewanUmum.makan("rumput");
        hewanUmum.infoHewan();

        System.out.println("\n=============================\n");
        System.out.println("Informasi Detail Hewan \n");

        Kucing kucing = new Kucing("Beuty", 3, "Persia");
        System.out.println("Informasi Kucing:");
        kucing.suara();
        kucing.makan("ikan");
        kucing.infoHewan();

        System.out.println("\n=============================\n");

        Burung burung = new Burung("Beo", 2, "Hijau, merah, kuning");
        System.out.println("Informasi Burung:");
        burung.suara();
        burung.makan("Biji-bijian");
        burung.infoHewan();
    }
}
