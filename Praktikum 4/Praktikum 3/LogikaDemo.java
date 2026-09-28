public class LogikaDemo {
    public static void main(String[] args) {
        // Bagian 1: Operator AND (&&)
        int nilaiUjian = 80;
        int kehadiran = 90; // persen

        if (nilaiUjian >= 75 && kehadiran >= 80) {
            System.out.println("LULUS mata kuliah");
        } else {
            System.out.println("TIDAK LULUS mata kuliah");
        }

        // Bagian 2: Operator OR (||) dan NOT (!)
        boolean punyaKTP = false;
        boolean punyaSIM = true;

        if (punyaKTP || punyaSIM) {
            System.out.println("Boleh menyewa kendaraan");
        }

        if (!punyaKTP) {
            System.out.println("KTP belum tersedia");
        }
    }
}