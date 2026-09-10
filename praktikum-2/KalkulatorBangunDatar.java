import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args) {

        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner sc = new Scanner(System.in);

        // PERSEGI PANJANG

        // Meminta pengguna memasukkan panjang (tipe double)
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = sc.nextDouble();

        // Meminta pengguna memasukkan lebar (tipe double)
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = sc.nextDouble();

        // Menghitung luas persegi panjang (panjang x lebar)
        double luasPersegiPanjang = panjang * lebar;

        // Menghitung keliling persegi panjang (2 x (panjang + lebar))
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        // Menampilkan hasil luas dan keliling persegi panjang
        System.out.println("\nHASIL PERSEGI PANJANG ");
        System.out.println("Luas Persegi Panjang     : " + luasPersegiPanjang);
        System.out.println("Keliling Persegi Panjang : " + kelilingPersegiPanjang);

        // Mengecek apakah luas persegi panjang > 100
        boolean luasBesar = luasPersegiPanjang > 100;

        // Menampilkan nilai variabel boolean luasBesar
        System.out.println("Luas Besar (> 100)?      : " + luasBesar);

        //  LINGKARAN

        // Meminta pengguna memasukkan jari-jari lingkaran (tipe double)
        System.out.print("\nMasukkan jari-jari lingkaran: ");
        double jariJari = sc.nextDouble();

        // Menghitung luas lingkaran menggunakan Math.PI (π x r x r)
        double luasLingkaran = Math.PI * jariJari * jariJari;

        // Menghitung keliling lingkaran menggunakan Math.PI (2 x π x r)
        double kelilingLingkaran = 2 * Math.PI * jariJari;

        // Menampilkan hasil luas dan keliling lingkaran
        System.out.println("\nHASIL LINGKARAN");
        System.out.println("Luas Lingkaran     : " + luasLingkaran);
        System.out.println("Keliling Lingkaran : " + kelilingLingkaran);

        // Menutup Scanner untuk mencegah kebocoran resource
        sc.close();
    }
}