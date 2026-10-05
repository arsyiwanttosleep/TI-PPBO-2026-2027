import java.util.Scanner;

public class KalkulatorMethod {
    static double tambah(double a, double b) {
        return a + b;
    }

    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    static double kurang(double a, double b) {
        return a - b;
    }

    static double kali(double a, double b) {
        return a * b;
    }

    static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: pembagian dengan nol");
            return 0;
        }
        return a / b;
    }

    static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }

    static double akarKuadrat(double a) {
        if (a < 0) {
            System.out.println("Error: akar dari bilangan negatif");
            return 0;
        }
        return Math.sqrt(a);
    }

    static double riwayatKeMaksimum(double[] riwayatHasil) {
        double max = riwayatHasil[0];
        for (double nilai : riwayatHasil) {
            if (nilai > max) max = nilai;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] riwayat = new double[100];
        int jumlahRiwayat = 0;
        int pilihan;

        do {
            System.out.println("\n=== Kalkulator Method ===");
            System.out.println("1. Tambah (2 angka)");
            System.out.println("2. Tambah (3 angka)");
            System.out.println("3. Kurang");
            System.out.println("4. Kali");
            System.out.println("5. Bagi");
            System.out.println("6. Pangkat");
            System.out.println("7. Akar Kuadrat");
            System.out.println("0. Keluar");
            System.out.print("Pilih operasi: ");
            pilihan = sc.nextInt();

            double hasil = 0;
            boolean dihitung = true;

            switch (pilihan) {
                case 1:
                    System.out.print("Angka 1: ");
                    double a1 = sc.nextDouble();
                    System.out.print("Angka 2: ");
                    double b1 = sc.nextDouble();
                    hasil = tambah(a1, b1);
                    break;
                case 2:
                    System.out.print("Angka 1: ");
                    double a2 = sc.nextDouble();
                    System.out.print("Angka 2: ");
                    double b2 = sc.nextDouble();
                    System.out.print("Angka 3: ");
                    double c2 = sc.nextDouble();
                    hasil = tambah(a2, b2, c2);
                    break;
                case 3:
                    System.out.print("Angka 1: ");
                    double a3 = sc.nextDouble();
                    System.out.print("Angka 2: ");
                    double b3 = sc.nextDouble();
                    hasil = kurang(a3, b3);
                    break;
                case 4:
                    System.out.print("Angka 1: ");
                    double a4 = sc.nextDouble();
                    System.out.print("Angka 2: ");
                    double b4 = sc.nextDouble();
                    hasil = kali(a4, b4);
                    break;
                case 5:
                    System.out.print("Angka 1: ");
                    double a5 = sc.nextDouble();
                    System.out.print("Angka 2: ");
                    double b5 = sc.nextDouble();
                    hasil = bagi(a5, b5);
                    break;
                case 6:
                    System.out.print("Basis: ");
                    double a6 = sc.nextDouble();
                    System.out.print("Pangkat: ");
                    double b6 = sc.nextDouble();
                    hasil = pangkat(a6, b6);
                    break;
                case 7:
                    System.out.print("Angka: ");
                    double a7 = sc.nextDouble();
                    hasil = akarKuadrat(a7);
                    break;
                case 0:
                    dihitung = false;
                    System.out.println("Keluar dari program.");
                    if (jumlahRiwayat > 0) {
                        System.out.println("Hasil terbesar: " + riwayatKeMaksimum(riwayat));
                    } else {
                        System.out.println("Belum ada riwayat perhitungan.");
                    }
                    break;
                default:
                    dihitung = false;
                    System.out.println("Pilihan tidak valid.");
            }

            if (dihitung) {
                System.out.println("Hasil: " + hasil);
                riwayat[jumlahRiwayat] = hasil;
                jumlahRiwayat++;
            }
        } while (pilihan != 0);

        sc.close();
    }
}