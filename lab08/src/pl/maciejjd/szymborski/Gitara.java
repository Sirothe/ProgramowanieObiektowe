package pl.maciejjd.szymborski;

import java.time.LocalDate;

public class Gitara extends Instrument{
    public Gitara(String producent, LocalDate rokProdukcji){
        super(producent, rokProdukcji);
    }
    public String dzwiek(){
        return "brzdek";
    }
}