package pl.edu.uwm.po.lab03;

import java.util.Random;

public class generuj {
    public static void generuj(int tab[],int n,int minWartosc,int maxWartosc) {
        Random rand = new Random();
        for(int i=0;i<n;i++) {
            tab[i]= rand.nextInt(Math.abs(minWartosc)+maxWartosc)-Math.abs(minWartosc);
        }
    }
}
