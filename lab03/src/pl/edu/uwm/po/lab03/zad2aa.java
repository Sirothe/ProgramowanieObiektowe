package pl.edu.uwm.po.lab03;

public class zad2aa {
    public static int ileParzystych(int tab[]) {
        int wynik=0;
        for(int i =0;i<tab.length;i++) {
            if(tab[i]%2==0) {
                wynik=wynik+1;
            }
        }
        return wynik;
    }
}
