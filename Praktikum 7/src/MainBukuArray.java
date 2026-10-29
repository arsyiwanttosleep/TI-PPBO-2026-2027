public class MainBukuArray {
    public static void main(String[] args) {
        Buku[] daftarBuku = new Buku[4];
        daftarBuku[0] = new Buku("Buku A", "Penulis A", 2010);
        daftarBuku[1] = new Buku("Buku B", "Penulis B", 2018);
        daftarBuku[2] = new Buku("Buku C", "Penulis C", 2020);
        daftarBuku[3] = new Buku("Buku D", "Penulis D", 2015);

        for (Buku b : daftarBuku) {
            if (b.tahunTerbit > 2015) {
                System.out.println(b.judul);
            }
        }
    }
}