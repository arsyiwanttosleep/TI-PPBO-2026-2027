import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int KKM = 90;

        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();

        int[] nilai = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        int total = 0;
        int max = nilai[0];
        int min = nilai[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < N; i++) {
            total += nilai[i];
            if (nilai[i] > max) max = nilai[i];
            if (nilai[i] < min) min = nilai[i];
            if (nilai[i] >= KKM) jumlahLulus++;
            else jumlahTidakLulus++;
        }

        double rataRata = (double) total / N;


        int[] nilaiSebelum = nilai.clone();

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        System.out.println("\n========== LAPORAN NILAI KELAS ==========");
        System.out.println("Jumlah Mahasiswa     : " + N);
        System.out.printf("Rata-rata Kelas      : %.2f%n", rataRata);
        System.out.println("Nilai Tertinggi      : " + max);
        System.out.println("Nilai Terendah       : " + min);
        System.out.println("KKM                  : " + KKM);
        System.out.println("Jumlah Lulus         : " + jumlahLulus);
        System.out.println("Jumlah Tidak Lulus   : " + jumlahTidakLulus);

        System.out.print("\nNilai Sebelum Diurutkan : ");
        for (int v : nilaiSebelum) System.out.print(v + " ");
        System.out.println();

        System.out.print("Nilai Setelah Diurutkan : ");
        for (int v : nilai) System.out.print(v + " ");
        System.out.println();
        System.out.println("=========================================");
    }
}