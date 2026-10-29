public class MainPersegiArray {
    public static void main(String[] args) {
        Persegi[] daftarPersegi = new Persegi[4];
        daftarPersegi[0] = new Persegi(3);
        daftarPersegi[1] = new Persegi(7);
        daftarPersegi[2] = new Persegi(2);
        daftarPersegi[3] = new Persegi(5);

        Persegi terbesar = daftarPersegi[0];
        for (Persegi p : daftarPersegi) {
            if (p.hitungLuas() > terbesar.hitungLuas()) {
                terbesar = p;
            }
        }
        System.out.println("Persegi terbesar memiliki sisi: " + terbesar.sisi);
        System.out.println("Luas: " + terbesar.hitungLuas());
    }
}