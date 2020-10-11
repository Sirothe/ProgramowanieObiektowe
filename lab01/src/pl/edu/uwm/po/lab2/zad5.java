package pl.edu.uwm.po.lab02;

import java.util.Scanner;

public class zad5 {
    public static int pary() {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int licznik=0;
        int wynik=0;
        double tablica[] = new double[d];
        for(int i=0;i<d;i++) {
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            licznik=licznik+1;
            tablica[i]=liczba;
            if(licznik>=2) {
                if(tablica[i-1]<0&&tablica[i]<0) {
                    wynik=wynik+1;
                }
            }
        }
        return wynik;
    }
}
