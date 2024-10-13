public class Penumpang {
    private String NIK;
    private String namaLengkap;

    public Penumpang(String NIK, String namaDepan, String namaBelakang) {
        this.NIK = NIK;
        this.namaLengkap = namaDepan + " " + namaBelakang;
    }

    public void tampilDetailPenumpang() {
        System.out.println("Nomor Induk Kependudukan: " + NIK);
        System.out.println("Nama Lengkap: " + namaLengkap);
    }
}
