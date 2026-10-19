public class DaftarMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[] daftar = new Mahasiswa[3];

        daftar[0] = new Mahasiswa("Arsyi", "2025573010072", 3.98);
        daftar[1] = new Mahasiswa("Dandi", "2025573010010", 3.8);
        daftar[2] = new Mahasiswa("Arkan", "2025573010012", 3.6);

        for (Mahasiswa m : daftar) {
            m.tampilkanData();
            System.out.println("---");
        }

        // Hitung Statistik
        int jumlahCumlaude = 0;
        for (Mahasiswa m : daftar) {
            if (m.isCumlaude()) {
                jumlahCumlaude++;
            }
        }
        System.out.println("Jumlah mahasiswa cumlaude: " + jumlahCumlaude);
    }
}