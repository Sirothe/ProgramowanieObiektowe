package pl.edu.uwm.po.lab03;

public class zad2c {
    public static int ileMaksymalnych(int tab[]) {
        int liczba=0;
        int wynik=1;
        for(int i =0;i<tab.length;i++) {
            if(tab[i]>liczba) {
                liczba=tab[i];
                wynik=1;
            }
            if(tab[i]==liczba) {
                wynik=wynik+1;
            }
        }
        return wynik;
    }
}
