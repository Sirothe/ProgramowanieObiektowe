package pl.maciejjd.szymborski;

import java.time.LocalDate;

public abstract class Osoba {
    public Osoba(String nazwisko,String[] imiona,boolean plec,LocalDate dataUrodzenia){
        this.nazwisko=nazwisko;
        this.imiona=imiona;
        this.plec=plec;
        this.dataUrodzenia=dataUrodzenia;
    }

    public abstract String getOpis();

    public String getNazwisko() {
        return this.nazwisko;
    }

    public String[] getImiona() {
        return this.imiona;
    }

    public boolean getPlec() {
        return this.plec;
    }

    public LocalDate getDataUrodzenia() {
        return this.dataUrodzenia;
    }

    @Override
    public String toString() {
        return "Nazwisko: "+this.nazwisko+"\nData Urodzienia: "+this.dataUrodzenia;
    }

    private String nazwisko;
    private String[] imiona;
    private LocalDate dataUrodzenia;
    private boolean plec;
}
