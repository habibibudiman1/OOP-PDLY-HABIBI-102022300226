// Don't delete any comments below!!!
import java.util.ArrayList;
import java.util.Scanner;

// Todo : Import Arraylist and Scanner

public class ManajemenInventaris {
    ArrayList <MakananKering> daftarMakananKering = new ArrayList<>();
    ArrayList <MakananBasah> daftarMakananBasah = new ArrayList<>();

    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items

    public void tambahMakananKering() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nama Makanan Kering: ");
        String nama = input.nextLine();
        System.out.println("Nama Jumlah Makanan Kering: ");
        int jumlah = input.nextInt();
        System.out.println("Nama Harga Kering: ");
        double harga = input.nextDouble();
        System.out.println("Nama Brand Makanan Kering: ");
        String brand = input.nextLine();
        
        MakananKering makankering = new MakananKering (nama, jumlah,harga,brand);
        daftarMakananKering.add(makankering);
        System.out.println("Makanan Basah Berhasil ditambahkan");
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan

        // Todo : Create a new object for MakananKering
        
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        
    }

    public void tambahMakananBasah() {

        Scanner input = new Scanner(System.in);
        System.out.println("Nama Makanan Basah: ");
        String nama = input.nextLine();
        System.out.println("Nama Jumlah Makanan Basah: ");
        int jumlah = input.nextInt();
        System.out.println("Nama Harga Basah: ");
        double harga = input.nextDouble();
        System.out.println("Nama Bahan Makanan Basah: ");
        String bahan = input.nextLine();
        
        MakananBasah makanbasah = new MakananBasah (nama, jumlah,harga,bahan);
        daftarMakananBasah.add(makanbasah);

        System.out.println("Makanan Basah Berhasil ditambahkan");
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan

        // Todo : Create a new object for MakananBasah
        
        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()){
            System.out.println("");
        } else {
            for (Makanan makan : daftarMakananBasah) {
                makan.tampilkanData();
                System.out.println("==================");
            for (Makanan makan : daftarMakananKering){
                makan.tampilkanData();

            }


            // Todo : Create Print Notification "Tidak ada makanan disini"
    
            // Todo : Create print notification for Makanan Kering  
            
            // Todo : Create print notification for  Makanan Basah
            
        }
    }
}
