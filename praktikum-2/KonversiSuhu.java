import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input
        Scanner sc = new Scanner(System.in);

        // Meminta input suhu dalam Celsius
        System.out.print("Masukkan suhu Celsius: ");
        double celsius = sc.nextDouble();

        // Rumus konversi: F = C * 9/5 + 32
        double fahrenheit = celsius * 9 / 5 + 32;

        // Menampilkan hasil konversi
        System.out.println("Suhu Fahrenheit: " + fahrenheit);

        sc.close();
    }
}