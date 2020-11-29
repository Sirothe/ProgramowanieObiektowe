package pl.maciejjd.szymborski;

import java.time.LocalDate;

public class Saxophone extends Instrument{
    public Saxophone(String producent, LocalDate rokProdukcji){
        super(producent, rokProdukcji);
    }
    @Override
    public String dzwiek(){
        return "tu  tutururururu tu";
    }
}