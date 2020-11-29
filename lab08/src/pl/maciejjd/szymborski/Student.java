package pl.maciejjd.szymborski;

import java.time.LocalDate;

public class Student extends Osoba{
    public Student(String nazwisko, String[] imiona, boolean plec, LocalDate dataUrodzienia, String kierunek, double sredniaOcen){
        super(nazwisko,imiona,plec,dataUrodzienia);
        this.kierunek=kierunek;
        this.sredniaOcen=sredniaOcen;
    }

    public String getKierunek() {
        return this.kierunek;
    }

    public double getSredniaOcen() {
        return this.sredniaOcen;
    }
    @Override //lab11
    public String getOpis()
    {
        return "student na kierunku studiow: " + this.kierunek + " ze srednia: "+this.sredniaOcen;
    }

    @Override
    public String toString() {
        return super.toString()+"\nKierunek: "+this.kierunek;
    }

    private String kierunek;
    private double sredniaOcen;
}
