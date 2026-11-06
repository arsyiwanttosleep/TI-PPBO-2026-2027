public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merek, int kecepatanMaks, int jumlahPintu) {
        super(merek, kecepatanMaks);
        this.jumlahPintu = jumlahPintu;
    }

    public void tampilkanInfo() {
        System.out.println("Mobil merek: " + merek
                + ", kecepatan maks: " + kecepatanMaks
                + " km/jam, jumlah pintu: " + jumlahPintu);
    }
}