public class LatihanClass {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Arsyi", "2025573010072", 3.98);

        // System.out.println(m1.ipk); // ERROR (Langkah 3)

        System.out.println("Nama: " + m1.getNama());
        System.out.println("IPK: " + m1.getIpk());

        m1.setIpk(3.8);
        System.out.println("IPK sekarang: " + m1.getIpk());

        m1.setIpk(9.9); // Ditolak
        System.out.println("IPK sekarang: " + m1.getIpk());
    }
}