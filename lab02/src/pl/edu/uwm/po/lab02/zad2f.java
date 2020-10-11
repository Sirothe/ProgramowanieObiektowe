package pl.edu.uwm.po.lab02;

import java.util.Scanner;

public class zad2f {
    public static double niepnrliczparz() {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int wynik=0;
        for(int i=0;i<d;i++) {
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            if((i+1)%2!=0&&liczba%2==0) {
                wynik=wynik+1;
            }
        }
        return wynik;
    }
}
