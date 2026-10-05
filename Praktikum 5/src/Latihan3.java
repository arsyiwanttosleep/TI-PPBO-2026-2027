public class Latihan3 {
    static double konversiSuhu(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static double konversiSuhu(double celsius, String skalaTujuan) {
        if (skalaTujuan.equalsIgnoreCase("Kelvin")) {
            return celsius + 273.15;
        } else if (skalaTujuan.equalsIgnoreCase("Fahrenheit")) {
            return (celsius * 9 / 5) + 32;
        }
        return celsius;
    }

    public static void main(String[] args) {
        System.out.println("30C ke Fahrenheit: " + konversiSuhu(30));
        System.out.println("30C ke Kelvin: " + konversiSuhu(30, "Kelvin"));
        System.out.println("100C ke Fahrenheit: " + konversiSuhu(100, "Fahrenheit"));
    }
}