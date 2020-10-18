package pl.edu.uwm.po.lab03;

public class zad2dd {
    public static int sumaUjemnych(int tab[]) {
        int wynik=0;
        for(int i =0;i<tab.length;i++) {
            if(tab[i]<0) {
                wynik=wynik+tab[i];
            }
        }
        return wynik;
    }
}
