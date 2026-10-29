public class BankDemo {
    public static void main(String[] args) {
        // Membuat minimal 2 object
        RekeningBank rek1 = new RekeningBank("001", "Budi", 100000, "Tabungan");
        RekeningBank rek2 = new RekeningBank("002", "Siti", 50000, "Giro");

        System.out.println("--- Skenario 1: Setor & Tarik ---");
        rek1.setor(50000);
        rek1.tarik(20000);
        rek2.setor(100000);

        System.out.println("\n--- Skenario 2: Transfer Berhasil ---");
        rek1.transferKe(rek2, 80000);

        System.out.println("\n--- Skenario 3: Transfer Gagal (Saldo Kurang) ---");
        rek2.transferKe(rek1, 500000);

        System.out.println("\n--- Skenario 4: Transfer Gagal (Jumlah Invalid) ---");
        rek1.transferKe(rek2, -5000);

        System.out.println("\n--- MUTASI AKHIR ---");
        rek1.cetakMutasi();
        rek2.cetakMutasi();
    }
}