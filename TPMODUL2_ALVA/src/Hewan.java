class Hewan {
    protected String nama;
    protected int umur;

    // Constructor Hewan
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Method suara()
    public void suara() {
        System.out.println("Hewan bersuara.");
    }

    // Method makan()
    public void makan() {
        System.out.println(nama + " sedang makan.");
    }

    // Method makan(String makanan)
    public void makan(String makanan) {
        System.out.println(nama + " sedang makan " + makanan + ".");
    }

    // Method infoHewan()
    public void infoHewan() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
}
