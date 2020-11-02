package pl.edu.uwm.po.lab05;

public class RachunekBankowy {
    private static double rocznaStopaProcentowa;
    private double saldo;
    public RachunekBankowy(double saldo) {
        this.saldo = saldo;
    }
    public void obliczMiesieczneOdsetki() {
        this.saldo=this.saldo+(this.saldo*rocznaStopaProcentowa)/12;
    }
    public static void setRocznaStopaProcentowa(double saldo) {
        rocznaStopaProcentowa=saldo;
    }
    public double getSaldo() {
        return this.saldo;
    }
}
