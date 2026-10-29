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
            p.tampilkanData();
        }

        System.out.println("\n=== SIMULASI PEMBELIAN ===");
        // Beli Laptop 2 buah
        // Menggunakan %.1f agar muncul .0 di belakang
        System.out.printf("Membeli 2 Laptop. Total: %.1f%n", daftarProduk[0].hitungTotalHarga(2));
        daftarProduk[0].kurangiStok(2);

        // Beli Monitor 6 buah (stok tidak cukup)
        System.out.printf("Membeli 6 Monitor. Total: %.1f%n", daftarProduk[3].hitungTotalHarga(6));
        daftarProduk[3].kurangiStok(6);

        System.out.println("\n=== PRODUK TERMAHAL ===");
        Produk termahal = daftarProduk[0];
        for (Produk p : daftarProduk) {
            if (p.harga > termahal.harga) {
                termahal = p;
            }
        }
        // Menggunakan %.1f agar muncul .0 di belakang
        System.out.printf("Produk termahal adalah: %s dengan harga %.1f%n", termahal.namaProduk, termahal.harga);
    }
}