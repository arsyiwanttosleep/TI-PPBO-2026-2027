public class MainProduk {
    public static void main(String[] args) {
        Produk p1 = new Produk("ak-47", 23000000);
        Produk p2 = new Produk("Kerambit", 546000);
        Produk p3 = new Produk("Vest Anti Peluru", 13500000);

        double batasHarga = 30000000;

        System.out.println(p1.namaProduk + " - " + p1.harga + " - " + p1.isMahal(batasHarga));
        System.out.println(p2.namaProduk + " - " + p2.harga + " - " + p2.isMahal(batasHarga));
        System.out.println(p3.namaProduk + " - " + p3.harga + " - " + p3.isMahal(batasHarga));
    }
}