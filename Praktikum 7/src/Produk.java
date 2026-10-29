public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        setHarga(harga);
        this.stok = stok;
    }

    public String getKodeProduk() { return kodeProduk; }
    public String getNamaProduk() { return namaProduk; }
    public double getHarga() { return harga; }
    public int getStok() { return stok; }

    public void setHarga(double harga) {
        if (harga >= 0) this.harga = harga;
        else System.out.println("Harga tidak boleh negatif");
    }

    public void tambahStok(int jumlah) {
        if (jumlah > 0) stok += jumlah;
        else System.out.println("Jumlah harus positif");
    }

    public void kurangiStok(int jumlah) {
        if (jumlah > 0) {
            if (stok >= jumlah) stok -= jumlah;
            else System.out.println("Stok tidak mencukupi");
        } else {
            System.out.println("Jumlah harus positif");
        }
    }
}