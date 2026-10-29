public class Siswa {
    private double nilai;

    public Siswa(double nilai) {
        this.nilai = nilai;
    }

    public double getNilai() { return nilai; }

    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai tidak valid (0-100)");
        }
    }

    public char getNilaiHuruf() {
        if (nilai >= 85) return 'A';
        else if (nilai >= 70) return 'B';
        else if (nilai >= 55) return 'C';
        else if (nilai >= 40) return 'D';
        else return 'E';
    }
}