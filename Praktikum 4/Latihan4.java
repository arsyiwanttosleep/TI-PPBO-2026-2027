import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriks = new int[3][3];

        System.out.println("Masukkan elemen matriks 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ");
                matriks[i][j] = sc.nextInt();
            }
        }

        int totalSeluruh = 0;
        System.out.println("Jumlah setiap baris:");
        for (int i = 0; i < 3; i++) {
            int jumlahBaris = 0;
            for (int j = 0; j < 3; j++) {
                jumlahBaris += matriks[i][j];
            }
            totalSeluruh += jumlahBaris;
            System.out.println("Baris " + (i + 1) + ": " + jumlahBaris);
        }
        System.out.println("Total seluruh elemen: " + totalSeluruh);
    }
}