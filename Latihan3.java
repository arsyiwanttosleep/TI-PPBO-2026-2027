import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Masukkan 10 bilangan:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array terbalik:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}