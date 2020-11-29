package pl.maciejjd.szymborski;

import java.time.LocalDate;

public class Gitara extends Instrument{
    public Gitara(String producent, LocalDate rokProdukcji){
        super(producent, rokProdukcji);
    }
    @Override //lab11
    public String dzwiek(){
        return "brzdek";
    }
}