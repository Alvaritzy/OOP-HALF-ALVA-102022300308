class Kucing extends Hewan {
    private String ras;

    // Constructor Kucing
    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    // Override Method suara()
    @Override
    public void suara() {
        System.out.println(nama + " mengeong.");
    }

    // Override Method infoHewan()
    @Override
    public void infoHewan() {
        super.infoHewan();
        System.out.println("Ras: " + ras);
    }
}