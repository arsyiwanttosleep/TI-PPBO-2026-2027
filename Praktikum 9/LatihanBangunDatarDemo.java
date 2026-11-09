public class LatihanBangunDatarDemo {

    public static void main(String[] args) {

        BangunDatar[] daftarBangun = {
                new Lingkaran(7),
                new Persegi(5),
                new Lingkaran(10),
                new Persegi(8)
        };

        double totalLuas = 0;

        for (BangunDatar bangun : daftarBangun) {

            double luas = bangun.hitungLuas();

            System.out.println(
                    bangun.namaBangun + ": " + luas
            );

            totalLuas += luas;
        }

        System.out.println("Total luas: " + totalLuas);
    }
}