public class RekeningBank {
    private String nomorRekening;
    private String pemilik;
    private double saldo;
    private String jenisRekening; // Tugas 1

    public RekeningBank(String nomor, String pemilik, double saldoAwal, String jenisRekening) {
        this.nomorRekening = nomor;
        this.pemilik = pemilik;
        this.saldo = (saldoAwal >= 0) ? saldoAwal : 0;
        this.jenisRekening = jenisRekening;
    }

    public String getNomorRekening() { return nomorRekening; }
    public String getPemilik() { return pemilik; }
    public double getSaldo() { return saldo; }
    public String getJenisRekening() { return jenisRekening; }

    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah setor harus lebih dari 0");
            return;
        }
        saldo += jumlah;
        System.out.println("Setor berhasil. Saldo: " + saldo);
    }

    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah tarik harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil. Saldo: " + saldo);
        }
    }

    // Tugas 2
    public void transferKe(RekeningBank tujuan, double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Transfer GAGAL: Jumlah harus positif.");
        } else if (jumlah > this.saldo) {
            System.out.println("Transfer GAGAL: Saldo tidak mencukupi.");
        } else {
            this.saldo -= jumlah;
            tujuan.saldo += jumlah;
            System.out.println("Transfer BERHASIL: Rp" + jumlah + " dari " + this.pemilik + " ke " + tujuan.pemilik);
        }
    }

    // Tugas 3
    public void cetakMutasi() {
        System.out.println("=== MUTASI REKENING ===");
        System.out.println("No. Rekening : " + nomorRekening);
        System.out.println("Pemilik      : " + pemilik);
        System.out.println("Jenis        : " + jenisRekening);
        System.out.println("Saldo Akhir  : Rp" + saldo);
        System.out.println("======================");
    }
}