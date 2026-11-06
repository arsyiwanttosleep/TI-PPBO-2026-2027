public class Motor extends Kendaraan {
    private String jenisMotor;

    public Motor(String merek, int kecepatanMaks, String jenisMotor) {
        super(merek, kecepatanMaks);
        this.jenisMotor = jenisMotor;
    }

    public void tampilkanInfo() {
        System.out.println("Motor merek: " + merek
                + ", kecepatan maks: " + kecepatanMaks
                + " km/jam, jenis: " + jenisMotor);
    }
}