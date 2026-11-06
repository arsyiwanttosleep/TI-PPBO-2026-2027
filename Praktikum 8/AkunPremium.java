public class AkunPremium extends Akun {
    private double batasKredit;

    public AkunPremium(String username, double saldo, double batasKredit) {
        super(username, saldo);
        this.batasKredit = batasKredit;
    }

    public void cekLimit() {
        System.out.println("User: " + username
                + " | Saldo: " + saldo
                + " | Batas Kredit: " + batasKredit);
    }
}