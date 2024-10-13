package TPMODUL1_HABIBI;

import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    static ArrayList<Penerbangan> penerbanganList = new ArrayList<>();
    static Penumpang penumpang;

    public static void main(String[] args) {
        penerbanganList.add(new Penerbangan("GA101", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
        penerbanganList.add(new Penerbangan("QZ202", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n======= EAD Ticket Booking System =======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli tiket");
            System.out.println("3. Tampilkan pesanan");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanDaftarPenerbangan();
                    break;
                case 2:
                    beliTiket(scanner);
                    break;
                case 3:
                    tampilkanPesanan();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void tampilkanDaftarPenerbangan() {
        System.out.println("\nDaftar Penerbangan:");
        for (int i = 0; i < penerbanganList.size(); i++) {
            System.out.print((i + 1) + ". ");
            penerbanganList.get(i).tampilDaftarPenerbangan();
        }
    }

    public static void beliTiket(Scanner scanner) {
        System.out.print("\nMasukkan NIK: ");
        String nik = scanner.nextLine();
        System.out.print("Nama Depan: ");
        String namaDepan = scanner.nextLine();
        System.out.print("Nama Belakang: ");
        String namaBelakang = scanner.nextLine();
        // kalo kapke print dia outputnya ke samping, kalo pake println dia kebawah
        
        penumpang = new Penumpang(nik, namaDepan, namaBelakang);
        tampilkanDaftarPenerbangan();
        
        System.out.print("Pilih nomor penerbangan: ");
        int index = scanner.nextInt() - 1;
        
        if (index >= 0 && index < penerbanganList.size()) {
            penumpang.setPenerbangan(penerbanganList.get(index));
            System.out.println("Pesanan Tiket Berhasil Dilakukan!.");
        } else {
            System.out.println("Penerbangan tidak tersedia.");
        }
    }

    public static void tampilkanPesanan() {
        if (penumpang != null && penumpang.getPenerbangan() != null) {
            System.out.println("\nDetail Tiket Penerbangan:");
            penumpang.tampilDaftarPenumpang();
            penumpang.getPenerbangan().tampilDaftarPenerbangan();
        } else {
            System.out.println("Pembelian tiket Tidak ada.");
        }
    }
}
