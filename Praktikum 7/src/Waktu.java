public class Waktu {
    private int jam;
    private int menit;
    private int detik;

    public Waktu(int jam, int menit, int detik) {
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }

    public int getJam() { return jam; }
    public int getMenit() { return menit; }
    public int getDetik() { return detik; }

    public void setJam(int jam) {
        if (jam >= 0 && jam <= 23) this.jam = jam;
        else System.out.println("Jam tidak valid (0-23)");
    }

    public void setMenit(int menit) {
        if (menit >= 0 && menit <= 59) this.menit = menit;
        else System.out.println("Menit tidak valid (0-59)");
    }

    public void setDetik(int detik) {
        if (detik >= 0 && detik <= 59) this.detik = detik;
        else System.out.println("Detik tidak valid (0-59)");
    }
}