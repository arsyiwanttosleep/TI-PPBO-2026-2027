public class MainPersegi {
    public static void main(String[] args) {
        Persegi p1 = new Persegi(5);
        Persegi p2 = new Persegi(10);

        System.out.println("Persegi 1 - Luas: " + p1.hitungLuas() + ", Keliling: " + p1.hitungKeliling());
        System.out.println("Persegi 2 - Luas: " + p2.hitungLuas() + ", Keliling: " + p2.hitungKeliling());
    }
}