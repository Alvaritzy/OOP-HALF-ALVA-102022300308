class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;

     // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }
    
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    public void Informasi(){
        super.Informasi();
        if (ruangPrivat == true) {
            System.out.println("Status = Ruangan Premium");
            System.out.println("");
            System.out.println("Fasilitas Ruangan Premium:");
            System.out.println("Ruangan AC pribadi");
            System.out.println("sofa gaming ekslusif");
            System.out.println("komputer spesifikasi tinggi");
        } else {
            System.out.println("Status = Ruangan Standar");
            System.out.println("");
            System.out.println("Fasilitas majapahit");
            System.out.println("PC spek jaman raden kian santang");
        }
    }
    
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void Pesan(int nomorKomputer){
        System.out.println("memesan komputer nomor =" + nomorKomputer);
    }
    
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    
    
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    
}
