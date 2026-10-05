import java.util.Scanner;

public class Latihan {
    static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }

    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    static boolean isPrima(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static double konversiSuhu(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static double konversiSuhu(double celsius, String skalaTujuan) {
        if (skalaTujuan.equalsIgnoreCase("Kelvin")) {
            return celsius + 273.15;
        } else if (skalaTujuan.equalsIgnoreCase("Fahrenheit")) {
            return (celsius * 9 / 5) + 32;
        }
        return celsius;
    }

    static int cariNilaiMinimum(int[] data) {
        int min = data[0];
        for (int nilai : data) {
            if (nilai < min) min = nilai;
        }
        return min;
    }

    static int cariNilaiMaksimum(int[] data) {
        int max = data[0];
        for (int nilai : data) {
            if (nilai > max) max = nilai;
        }
        return max;
    }

    static int hitungTotal(int[] data) {
        int total = 0;
        for (int nilai : data) total += nilai;
        return total;
    }

    static int[] filterDiAtasRataRata(int[] data) {
        double rata = (double) hitungTotal(data) / data.length;
        int count = 0;
        for (int nilai : data) {
            if (nilai > rata) count++;
        }
        int[] hasil = new int[count];
        int idx = 0;
        for (int nilai : data) {
            if (nilai > rata) hasil[idx++] = nilai;
        }
        return hasil;
    }

    public static void main(String[] args) {
        System.out.println("Luas persegi panjang 5x3: " + luasPersegiPanjang(5, 3));
        System.out.println("Luas lingkaran r=7: " + luasLingkaran(7));

        System.out.print("Bilangan prima 1-50: ");
        for (int i = 1; i <= 50; i++) {
            if (isPrima(i)) System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("30C ke Fahrenheit: " + konversiSuhu(30));
        System.out.println("30C ke Kelvin: " + konversiSuhu(30, "Kelvin"));

        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah nilai ujian: ");
        int n = sc.nextInt();
        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
        System.out.println("Minimum: " + cariNilaiMinimum(nilai));
        System.out.println("Maksimum: " + cariNilaiMaksimum(nilai));
        System.out.println("Total: " + hitungTotal(nilai));
        System.out.print("Di atas rata-rata: ");
        for (int v : filterDiAtasRataRata(nilai)) {
            System.out.print(v + " ");
        }
        System.out.println();
        sc.close();
    }
}