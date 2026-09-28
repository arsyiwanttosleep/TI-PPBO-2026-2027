import java.util.Scanner;

public class HitungTarifListrik {

    static final double TARIF_450   = 415.0;
    static final double TARIF_900   = 1352.0;
    static final double TARIF_1300  = 1444.70;
    static final double TARIF_2200  = 1444.70;
    static final double TARIF_ABOVE = 1699.53;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PROGRAM HITUNG TARIF LISTRIK ===");
        System.out.println("Golongan daya yang tersedia:");
        System.out.println("  1. 450 VA");
        System.out.println("  2. 900 VA");
        System.out.println("  3. 1300 VA");
        System.out.println("  4. 2200 VA");
        System.out.println("  5. Di atas 2200 VA");

        System.out.print("Pilih golongan daya (1-5): ");
        int pilihan = sc.nextInt();

        System.out.print("Masukkan jumlah pemakaian (kWh): ");
        double kwh = sc.nextDouble();


        if (kwh <= 0) {
            System.out.println("ERROR: Jumlah pemakaian kWh harus lebih besar dari 0!");
            sc.close();
            return;
        }

        double tarif;
        String golongan;

        switch (pilihan) {
            case 1:
                golongan = "450 VA";
                tarif = TARIF_450;
                break;
            case 2:
                golongan = "900 VA";
                tarif = TARIF_900;
                break;
            case 3:
                golongan = "1300 VA";
                tarif = TARIF_1300;
                break;
            case 4:
                golongan = "2200 VA";
                tarif = TARIF_2200;
                break;
            case 5:
                golongan = "Di atas 2200 VA";
                tarif = TARIF_ABOVE;
                break;
            default:
                System.out.println("ERROR: Pilihan golongan daya tidak valid!");
                sc.close();
                return;
        }


        double totalTagihan = kwh * tarif;

        System.out.println();
        System.out.println("RINCIAN TAGIHAN LISTRIK");
        System.out.printf("Golongan Daya     : %s%n", golongan);
        System.out.printf("Pemakaian         : %.2f kWh%n", kwh);
        System.out.printf("Tarif per kWh     : Rp %.2f%n", tarif);
        System.out.printf("TOTAL TAGIHAN     : Rp %.2f%n", totalTagihan);

        sc.close();
    }
}