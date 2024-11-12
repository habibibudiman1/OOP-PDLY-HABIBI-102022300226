class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;
    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium( float hargaPerJam, int jumlahKomputer, String namaWarnet, boolean ruangPrivat) {
        super(hargaPerJam, jumlahKomputer, namaWarnet);
        this.ruangPrivat = ruangPrivat;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    @Override
    public void Informasi(){
        super.Informasi();
        if(ruangPrivat){
            System.out.println("Status : Ruangan Premium ");
            System.out.println("");
            System.out.println("- Ruangan ber-AC pribadi");
            System.out.println("- Sofa gaming exclusive");
            System.out.println("- Komputer spesifikasi tinggi");
            System.out.println("- Koneksi internet dedicated 100Mbps");
            
        }
        else{
            System.out.println("Status : Standar ");
            System.out.println("");
            System.out.println("- Ruangan gerah");
            System.out.println("- Sofa batu");
            System.out.println("- Komputer spesifikasi jadul");
            System.out.println("- Koneksi internet dedicated 1Mbps");
        }
    }
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void Pesan(int nomerKomputer){
        System.out.println("Memesan nomer komputer : " + nomerKomputer);
    }
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan(String makanan){
        System.out.println("Menambah layanan makanan: "+ makanan);
    }
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void TambahLayanan(String makanan, String minuman){
        System.out.println("Menambah layanan makanan : " + makanan + "dan" + minuman);
    }

   
}
