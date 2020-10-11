package pl.edu.uwm.po.lab02;

import java.util.Scanner;

public class zad2e {
    public static double warunekb() {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int wynik=0;
        silnia sil = new silnia();
        for(int i=0;i<d;i++) {
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            if(Math.pow(2,i)<liczba&&liczba<sil.silnia(i+1)) {
                wynik=wynik+1;
            }
        }
        return wynik;
    }
}
