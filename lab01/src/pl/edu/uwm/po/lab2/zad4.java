package pl.edu.uwm.po.lab02;

import java.util.Scanner;

public class zad4 {
    public static void najmnajwliczba() {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        double najm=0;
        double najw=0;
        for(int i=0;i<d;i++) {
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            if(liczba>najw) {
                najw=liczba;
            }
            if(liczba<najm) {
                najm=liczba;
            }
        }
        System.out.println("Liczba najwieksza: " + najw);
        System.out.println("Liczba najmniejsza: " + najm);
    }
}
