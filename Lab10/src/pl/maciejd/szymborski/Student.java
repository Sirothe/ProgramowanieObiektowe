package pl.maciejd.szymborski;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable,Comparable<Osoba> {
    public Student(String nazwisko, LocalDate dataUr,double srednia) {
        super(nazwisko, dataUr);
        this.srednia=srednia;
    }
    @Override //lab11
    public String toString () {
        return this.getClass().getSimpleName()+"["+this.getNazwisko()+" "+this.getDataUrodzenia()+" "+this.srednia+"]";
    }
    @Override //lab11
    public int compareTo(Osoba os) {
        int temp = super.compareTo(os);
        if((os instanceof Student) && (temp==0)) {
            return -(int)Math.ceil(this.srednia-((Student) os).srednia);
        }
        return temp;
    }
    private double srednia;
}
