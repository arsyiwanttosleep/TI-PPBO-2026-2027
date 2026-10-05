public class Latihan5 {
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
        int[] nilai = {80, 75, 90, 60, 88};
        System.out.println("Total: " + hitungTotal(nilai));
        System.out.print("Di atas rata-rata: ");
        for (int v : filterDiAtasRataRata(nilai)) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
