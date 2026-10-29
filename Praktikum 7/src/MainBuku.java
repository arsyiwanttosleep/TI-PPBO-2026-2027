public class MainBuku {
    public static void main(String[] args) {
        Buku b1 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);
        Buku b2 = new Buku("Bumi Manusia", "Pramoedya Ananta Toer", 1980);

        // Menggunakan getter, bukan akses langsung (b1.judul)
        System.out.println(b1.getJudul() + " - " + b1.getPengarang() + " - " + b1.getTahunTerbit());
        System.out.println(b2.getJudul() + " - " + b2.getPengarang() + " - " + b2.getTahunTerbit());
    }
}