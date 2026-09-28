import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Tidak ada nilai terbesar kedua.");
        } else {
            System.out.println("Nilai terbesar kedua: " + secondMax);
        }
    }
}