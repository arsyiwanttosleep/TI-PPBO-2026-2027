public class PerusahaanDemo {
    public static void main(String[] args) {
        System.out.println("=== Manager ===");
        Manager mgr = new Manager("Budi", "M001", 8000000, 2000000);
        mgr.tampilkanData();
        System.out.println("Tunjangan Jabatan: " + mgr.getTunjanganJabatan());

        System.out.println("\n=== Staff ===");
        Staff stf = new Staff("Sari", "S001", 5000000, 1000000);
        stf.tampilkanData();
        System.out.println("Tunjangan Kinerja: " + stf.getTunjanganKinerja());

        System.out.println("\n=== Direktur ===");
        Direktur dir = new Direktur("Andi", "D001", 15000000, 5000000, 3000000);
        dir.tampilkanData();
        System.out.println("Tunjangan Jabatan: " + dir.getTunjanganJabatan());
        System.out.println("Tunjangan Saham  : " + dir.getTunjanganSaham());

        System.out.println("\n=== Uji Validasi Gaji Negatif ===");
        Manager mgrNeg = new Manager("Negatif", "X001", -5000000, 1000000);
        mgrNeg.tampilkanData();
    }
}