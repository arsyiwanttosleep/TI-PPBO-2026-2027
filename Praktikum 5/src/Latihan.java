public class Latihan1 {
    static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }

    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        System.out.println("Luas persegi panjang 5x3: " + luasPersegiPanjang(5, 3));
        System.out.println("Luas persegi panjang 10x2: " + luasPersegiPanjang(10, 2));
        System.out.println("Luas lingkaran r=7: " + luasLingkaran(7));
        System.out.println("Luas lingkaran r=14: " + luasLingkaran(14));
    }
}