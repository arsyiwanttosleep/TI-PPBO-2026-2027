public class MainBuku {
    public static void main(String[] args) {
        Buku b1 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);
        Buku b2 = new Buku("Bumi Manusia", "Pramoedya Ananta Toer", 1980);

        System.out.println(b1.judul + " - " + b1.pengarang + " - " + b1.tahunTerbit);
        System.out.println(b2.judul + " - " + b2.pengarang + " - " + b2.tahunTerbit);
    }
}