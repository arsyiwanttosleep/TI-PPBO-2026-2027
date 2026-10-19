public class LatihanClass {
    public static void main(String[] args) {
        Mahasiswa m2 = new Mahasiswa("Arsyi", "2025573010072", 3.98);
        m2.tampilkanData();
        System.out.println("Cumlaude? " + m2.isCumlaude());
    }
}