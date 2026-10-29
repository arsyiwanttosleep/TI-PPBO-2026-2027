public class UjiLatihan {
    public static void main(String[] args) {

        System.out.println("=== UJI LATIHAN 1 & 2: BUKU ===");
        Buku b1 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);
        System.out.println("Judul Awal: " + b1.getJudul());
        b1.setJudul("Laskar Pelangi Edisi Baru");
        System.out.println("Judul Baru: " + b1.getJudul());
        // b1.setTahunTerbit(2010); // Ini akan ERROR karena read-only (sesuai Latihan 2)

        System.out.println("\n=== UJI LATIHAN 3: WAKTU ===");
        Waktu w = new Waktu(10, 30, 45);
        System.out.println("Waktu Awal: " + w.getJam() + ":" + w.getMenit() + ":" + w.getDetik());
        w.setJam(25); // Ditolak
        w.setMenit(70); // Ditolak
        w.setDetik(15); // Valid
        System.out.println("Waktu Akhir: " + w.getJam() + ":" + w.getMenit() + ":" + w.getDetik());

        System.out.println("\n=== UJI LATIHAN 4: SISWA ===");
        Siswa s = new Siswa(80);
        System.out.println("Nilai: " + s.getNilai() + " | Huruf: " + s.getNilaiHuruf());
        s.setNilai(110); // Ditolak
        System.out.println("Nilai setelah ditolak: " + s.getNilai());

        System.out.println("\n=== UJI LATIHAN 5: PRODUK ===");
        Produk p = new Produk("P01", "Laptop", 15000000, 10);
        p.setHarga(-5000); // Ditolak
        System.out.println("Harga Laptop: " + p.getHarga());
        p.tambahStok(5); // Stok jadi 15
        p.kurangiStok(20); // Ditolak karena stok kurang
        System.out.println("Stok Akhir: " + p.getStok());
    }
}