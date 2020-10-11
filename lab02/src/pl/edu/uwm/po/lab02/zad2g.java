package pl.edu.uwm.po.lab02;

import java.util.Scanner;

public class zad2g {
    public static double nieparznieuj() {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int wynik=0;
        for(int i=0;i<d;i++) {
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            if(liczba>0&&liczba%2!=0) {
                wynik=wynik+1;
            }
        }
        return wynik;
    }
}
