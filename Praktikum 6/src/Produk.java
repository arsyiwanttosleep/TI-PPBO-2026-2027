public class Produk {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    // Constructor untuk Latihan 3
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Constructor untuk Tugas
    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // Method Latihan 3
    public boolean isMahal(double batasHarga) {
        return harga > batasHarga;
    }

    // Method Tugas
    public double hitungTotalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }

    public void kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi");
        }
    }

    public void tampilkanData() {
        System.out.println("Kode: " + kodeProduk + " | Nama: " + namaProduk + " | Harga: " + harga + " | Stok: " + stok);
    }
}

// Class ini TIDAK pakai 'public' agar bisa menumpang di file Produk.java
class JalankanSemua {
    public static void main(String[] args) {

        // --- MENJALANKAN LATIHAN 3 ---
        System.out.println("=== LATIHAN 3 ===");
        Produk p1 = new Produk("ak-47", 23000000);
        Produk p2 = new Produk("Kerambit", 546000);
        Produk p3 = new Produk("Vest Anti Peluru", 13500000);

        double batasHarga = 30000000;

        System.out.println(p1.namaProduk + " - " + p1.harga + " - " + p1.isMahal(batasHarga));
        System.out.println(p2.namaProduk + " - " + p2.harga + " - " + p2.isMahal(batasHarga));
        System.out.println(p3.namaProduk + " - " + p3.harga + " - " + p3.isMahal(batasHarga));

        System.out.println("\n=================\n");

        // --- MENJALANKAN TUGAS ---
        System.out.println("=== TUGAS (TokoDemo) ===");
        Produk[] daftarProduk = new Produk[5];
        daftarProduk[0] = new Produk("P01", "Laptop", 15000000, 10);
        daftarProduk[1] = new Produk("P02", "Mouse", 150000, 50);
        daftarProduk[2] = new Produk("P03", "Keyboard", 500000, 20);
        daftarProduk[3] = new Produk("P04", "Monitor", 2500000, 5);
        daftarProduk[4] = new Produk("P05", "Flashdisk", 100000, 100);

        for (Produk p : daftarProduk) {
            p.tampilkanData();
        }

        System.out.println("\nSimulasi Pembelian:");
        System.out.println("Beli 2 Laptop. Total: " + daftarProduk[0].hitungTotalHarga(2));
        daftarProduk[0].kurangiStok(2);

        System.out.println("Beli 6 Monitor. Total: " + daftarProduk[3].hitungTotalHarga(6));
        daftarProduk[3].kurangiStok(6);

        Produk termahal = daftarProduk[0];
        for (Produk p : daftarProduk) {
            if (p.harga > termahal.harga) {
                termahal = p;
            }
        }
        System.out.println("\nProduk termahal: " + termahal.namaProduk + " (Rp" + termahal.harga + ")");
    }
}