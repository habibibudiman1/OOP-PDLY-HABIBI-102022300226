public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer komputer = new Komputer(5000, 20, "Warnet COFSI");

        // To do: Panggillah Method Informasi dari class Komputer
        komputer.Informasi();
        

        System.out.println();


        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP komputerVIP = new KomputerVIP(7000, 15, "Warnet COFSI", true);

        // To do: Panggillah Method Informasi dari class KomputerVIP
        komputerVIP.Informasi();

        // To do: Panggillah Method Login
        komputerVIP.Login("Labubu");

        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        komputerVIP.Bermain(2);
        komputerVIP.Bermain(2, 3);
        

        System.out.println();


        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium komputerPremium = new KomputerPremium(10000, 5, "Warnet COFSI", false);

        // To do: Panggillah Method Informasi dari class KomputerPremium
        komputerPremium.Informasi();
        // To do: Panggillah Method Pesan
        komputerPremium.Pesan(5);

        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
        komputerPremium.TambahLayanan("Ayam Bakar");
        komputerPremium.TambahLayanan("Ayam Bakar", "Es Teh Manis");
       
    }
}