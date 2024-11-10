class Burung extends Hewan {
    private String warnaBulu;

    // Constructor Burung
    public Burung(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }

    // Override Method suara()
    @Override
    public void suara() {
        System.out.println(nama + " berkicau.");
    }

    public void infoHewan() {
        super.infoHewan();
        System.out.println("Warna bulu: " + warnaBulu);
    }
}