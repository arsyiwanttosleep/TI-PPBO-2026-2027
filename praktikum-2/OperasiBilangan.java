import java.util.Scanner;

public class OperasiBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dua bilangan bulat
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = sc.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = sc.nextInt();

        // Operator Aritmatika =====
        System.out.println("Operator Aritmatika");
        System.out.println("Jumlah     (+): " + (bil1 + bil2));
        System.out.println("Selisih    (-): " + (bil1 - bil2));
        System.out.println("Kali       (*): " + (bil1 * bil2));
        System.out.println("Bagi       (/): " + (bil1 / bil2));
        System.out.println("Sisa Bagi  (%): " + (bil1 % bil2));

        // Operator Perbandingan (menghasilkan boolean) =====
        System.out.println("Operator Perbandingan");
        System.out.println("bil1 > bil2  : " + (bil1 > bil2));
        System.out.println("bil1 < bil2  : " + (bil1 < bil2));
        System.out.println("bil1 == bil2 : " + (bil1 == bil2));

        sc.close();
    }
}