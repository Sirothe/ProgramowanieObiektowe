package pl.edu.uwm.po.lab03;

public class zad2g {
    public static void odwrocFragment(int tab[],int lewy,int prawy) {
        int temptab;
        int temp=0;
        for(int i=lewy;i<prawy-1;i++) {
            temptab = tab[i];
            tab[i] = tab[prawy - temp];
            tab[prawy - temp] = temptab;
            temp++;
        }
    }
}
