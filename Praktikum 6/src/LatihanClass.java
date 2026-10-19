public class LatihanClass{
    public static void main(String[] args) {
     Mahasiswa m1 = new Mahasiswa();

     m1.nama = "Arsyi";
     m1.nim = "2025573010072";
     m1.ipk = 3.98;
     
     Mahasiswa m2 = new Mahasiswa();
     m2.nama = "Alexa";
     m2.nim = "2026674010023";
     m2.ipk = 3.87;


     System.out.println(m1.nama + " - "+ m1.ipk);
     System.out.println(m2.nama + " - " + m2.ipk);

        }
    }
