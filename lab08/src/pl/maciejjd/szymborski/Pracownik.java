package pl.maciejjd.szymborski;

import java.time.LocalDate;

public class Pracownik extends Osoba {

    public Pracownik(String nazwisko,String[] imiona,boolean plec,LocalDate dataUrodzenia, double pobory,LocalDate dataZatrudnienia) {
        super(nazwisko,imiona,plec,dataUrodzenia);
        this.nazwisko = nazwisko;
        this.pobory = pobory;
        this.dataZatrudnienia =dataZatrudnienia;
    }

    public String nazwisko() {
        return this.nazwisko;
    }

    public double pobory() {
        return this.pobory;
    }

    public LocalDate dataZatrudnienia() {
        return this.dataZatrudnienia;
    }

    public void zwiekszPobory(double procent) {
        double podwyzka = this.pobory * procent / 100;
        this.pobory += podwyzka;
    }
    @Override
    public String getOpis()
    {
        return String.format("pracownik zatrudniony w : %s pensja : %.2f zł", this.dataZatrudnienia.toString(),this.pobory);
    }

    private String nazwisko;
    private double pobory;
    private LocalDate dataZatrudnienia;
}
