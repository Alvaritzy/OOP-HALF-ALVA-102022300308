public class Penerbangan {
    private String nomorPenerbangan;
    private String bandaraKeberangkatan;
    private String bandaraTujuan;
    private String waktuKeberangkatan;
    private String waktuKedatangan;
    private float hargaTiket;

    public Penerbangan(String nomorPenerbangan, String bandaraKeberangkatan, 
                       String bandaraTujuan, String waktuKeberangkatan, 
                       String waktuKedatangan, float hargaTiket) {
        this.nomorPenerbangan = nomorPenerbangan;
        this.bandaraKeberangkatan = bandaraKeberangkatan;
        this.bandaraTujuan = bandaraTujuan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuKedatangan = waktuKedatangan;
        this.hargaTiket = hargaTiket;
    }

    public void tampilDaftarPenerbangan(int index) {
        System.out.println((index + 1) + ". Nomor: " + nomorPenerbangan + 
                           ", Keberangkatan: " + bandaraKeberangkatan + 
                           " --> Tujuan: " + bandaraTujuan);
        System.out.println("Waktu: " + waktuKeberangkatan + 
                           " ---> " + waktuKedatangan + 
                           ", Harga: Rp." + hargaTiket);
    }

    public String getNomorPenerbangan() {
        return nomorPenerbangan;
    }

    public float getHargaTiket() {
        return hargaTiket;
    }
}
