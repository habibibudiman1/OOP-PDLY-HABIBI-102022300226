public class Kucing extends Hewan {
    private final String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur); 
        this.ras = ras;
    }

    @Override
    public void suara() {
        System.out.println("Suara Beuty Meong!");
    }

    @Override
    public void infoHewan() {
        super.infoHewan();
        System.out.println("Ras: " + ras);
    }
}
