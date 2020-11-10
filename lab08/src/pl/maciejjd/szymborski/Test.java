package pl.maciejjd.szymborski;

import java.time.*;

public class Test {
    public static void main(String[] args) {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Zeszyk", new String[]{"Jan"}, true,LocalDate.of(1997,12,30),3000, LocalDate.of(2002,4,18));
        ludzie[1] = new Student("Weselska", new String[]{"Małgorzata","Anna"},false,LocalDate.of(1990,8,12), "mechatronika",4.0);

        for (Osoba p : ludzie) {
            for ( String i : p.getImiona()){
                System.out.print(i+" ");
            }
            System.out.print(p.getNazwisko() + ": " + p.getOpis()+ " urodzony/a w : "+p.getDataUrodzenia()+", plec: ");
            if(p.getPlec()){
                System.out.println("Mezczyzna");
            }
            else {
                System.out.println("Kobieta");
            }
        }
    }
}


