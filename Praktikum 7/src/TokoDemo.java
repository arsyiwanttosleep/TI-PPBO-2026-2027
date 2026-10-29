public class TokoDemo {
    public static void main(String[] args) {
        Produk[] daftarProduk = new Produk[5];
        daftarProduk[0] = new Produk("P01", "Laptop", 15000000, 10);
        daftarProduk[1] = new Produk("P02", "Mouse", 150000, 50);
        daftarProduk[2] = new Produk("P03", "Keyboard", 500000, 20);
        daftarProduk[3] = new Produk("P04", "Monitor", 2500000, 5);
        daftarProduk[4] = new Produk("P05", "Flashdisk", 100000, 100);

        System.out.println("=== DAFTAR PRODUK ===");
        for (Produk p : daftarProduk) {
            System.out.println("Kode: " + p.getKodeProduk() +
                    " | Nama: " + p.getNamaProduk() +
                    " | Harga: " + p.getHarga() +
                    " | Stok: " + p.getStok());
        }

        System.out.println("\n=== SIMULASI PEMBELIAN ===");
        // Simulasi beli 2 Laptop
        System.out.println("Membeli 2 Laptop. Harga Satuan: " + daftarProduk[0].getHarga());
        daftarProduk[0].kurangiStok(2);

        // Simulasi beli 6 Monitor (stok tidak cukup)
        System.out.println("Membeli 6 Monitor. Harga Satuan: " + daftarProduk[3].getHarga());
        daftarProduk[3].kurangiStok(6);

        System.out.println("\n=== PRODUK TERMAHAL ===");
        Produk termahal = daftarProduk[0];
        for (Produk p : daftarProduk) {
            // Pakai getHarga() bukan p.harga
            if (p.getHarga() > termahal.getHarga()) {
                termahal = p;
            }
        }
        // Pakai getNamaProduk() dan getHarga() bukan termahal.namaProduk
        System.out.printf("Produk termahal adalah: %s dengan harga %.1f%n", termahal.getNamaProduk(), termahal.getHarga());
    }
}