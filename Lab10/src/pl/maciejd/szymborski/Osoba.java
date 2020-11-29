package pl.maciejd.szymborski;

import java.time.LocalDate;

public class Osoba implements Comparable<Osoba> {

    public Osoba(String nazwisko,LocalDate dataUr) {
        this.dataUrodzenia=dataUr;
        this.nazwisko=nazwisko;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }
    @Override //lab11
    public String toString() {
        return this.getClass().getSimpleName()+"["+this.nazwisko+" "+this.dataUrodzenia+"]";
    }
    @Override //lab11
    public boolean equals(Object ob) {
        Osoba osoba = (Osoba)ob;
        return (osoba.nazwisko.equals(this.nazwisko) && osoba.dataUrodzenia.equals(this.dataUrodzenia));
    }

    @Override
    public int compareTo(Osoba o) {
        int compare_nazwisko= this.nazwisko.compareTo(o.nazwisko);
        if(compare_nazwisko==0){
            return this.dataUrodzenia.compareTo(o.dataUrodzenia);
        }
        return compare_nazwisko;
    }
    private String nazwisko;
    private LocalDate dataUrodzenia;
}
