public class LatihanClass {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa(); // constructor default
        Mahasiswa m2 = new Mahasiswa("Arsyi", "2025573010072", 3.98); // berparameter

        System.out.println(m1.nama + " - " + m1.ipk);
        System.out.println(m2.nama + " - " + m2.ipk);
    }
}