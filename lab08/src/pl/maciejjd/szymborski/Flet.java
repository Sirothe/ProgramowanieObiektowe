package pl.maciejjd.szymborski;

import java.time.LocalDate;

public class Flet extends Instrument{
    public Flet(String producent, LocalDate rokProdukcji){
        super(producent,rokProdukcji);
    }
    @Override //lab11
    public String dzwiek(){
        return "fii fiii";
    }
}
