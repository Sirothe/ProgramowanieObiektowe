package pl.maciejjd.szymborski;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args) {
        ArrayList<Instrument> orkiestra = new ArrayList<>();
        orkiestra.add(new Gitara("Yamaha", LocalDate.of(1973,5,30)));
        orkiestra.add(new Saxophone("Yamaha", LocalDate.of(1991,3,28)));
        orkiestra.add(new Flet("Tupote", LocalDate.of(2010,1,12)));
        orkiestra.add(new Gitara("Taika", LocalDate.of(2011,3,5)));
        orkiestra.add(new Saxophone("Gator", LocalDate.of(1976,10,27)));
        orkiestra.add(new Saxophone("Yamaha", LocalDate.of(1991,3,28)));
        for(Instrument instrument: orkiestra){
            System.out.print(instrument.dzwiek()+" ");
            System.out.println(instrument);
        }
        System.out.println(orkiestra.get(0).equals(orkiestra.get(2)));
        System.out.println(orkiestra.get(1).equals(orkiestra.get(5)));
        System.out.println(orkiestra.get(4).getProducent());
        System.out.println(orkiestra.get(4).getRokProdukcji());
    }
}