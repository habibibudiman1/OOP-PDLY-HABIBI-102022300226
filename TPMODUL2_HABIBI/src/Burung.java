public class Burung extends Hewan {
    private final String warnaBulu;

    public Burung(String nama, int umur, String warnaBulu) {
        super(nama, umur); 
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void suara() {
        System.out.println( nama +" Berkicau Cuit-cuit!");
    }

    @Override
    public void infoHewan() {
        super.infoHewan();
        System.out.println("Warna Bulu: " + warnaBulu);
    }
}
