public class TugasBangunDatarDemo {

    public static void main(String[] args) {

        // Membuat array berisi minimal 5 objek
        BangunDatar[] daftarBangun = {

                new Lingkaran(7),
                new Persegi(5),
                new PersegiPanjang(8, 4),
                new Lingkaran(10),
                new Persegi(12)

        };

        double totalLuas = 0;

        double luasTerbesar = 0;

        BangunDatar bangunTerbesar = null;

        // Menampilkan informasi setiap bangun
        for (BangunDatar bangun : daftarBangun) {

            bangun.tampilkanInfo();

            double luas = bangun.hitungLuas();

            // Menghitung total luas
            totalLuas += luas;

            // Mencari bangun dengan luas terbesar
            if (bangunTerbesar == null || luas > luasTerbesar) {

                luasTerbesar = luas;

                bangunTerbesar = bangun;
            }
        }

        // Menampilkan hasil akhir
        System.out.println("TOTAL LUAS SELURUH BANGUN: " + totalLuas);

        System.out.println();

        System.out.println("BANGUN DENGAN LUAS TERBESAR");
        System.out.println("Nama Bangun : " + bangunTerbesar.namaBangun);
        System.out.println("Luas        : " + luasTerbesar);
    }
}