import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();

        System.out.print("Apakah mahasiswa? (true/false): ");
        boolean mahasiswa = sc.nextBoolean();

        int harga;

        // Mahasiswa DAN umur < 25 tahun mendapat harga khusus
        if (mahasiswa && umur < 25) {
            harga = 25000;
            System.out.println("Kategori: Mahasiswa (harga khusus)");
        } else if (umur < 13) {
            harga = 20000;
            System.out.println("Kategori: Anak-anak");
        } else if (umur >= 60) {
            harga = 30000;
            System.out.println("Kategori: Lansia");
        } else {
            harga = 40000;
            System.out.println("Kategori: Umum");
        }

        System.out.println("Harga tiket: Rp " + harga);
        sc.close();
    }
}