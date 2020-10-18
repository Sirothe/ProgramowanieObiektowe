package pl.edu.uwm.po.lab03;

public class zad2e {
    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[]) {
        int wynik=0;
        int temp=0;
        for(int i =0;i<tab.length;i++) {
            if(tab[i]>0) {
                temp=temp+1;
            }else {
                if(temp>wynik) {
                    wynik=temp;
                }
                temp=0;
            }
        }
        return wynik;
    }
}
