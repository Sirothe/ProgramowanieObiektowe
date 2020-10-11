package pl.edu.uwm.po.lab02;

import java.util.Scanner;

public class zad2c {
    public static int liczkwadparz() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int ilosc=0;
        for (int i = 0; i < a; i++) {
            System.out.println("podaj liczbę");
            double liczba = scan.nextInt();
            if(Math.sqrt(liczba)%2==0) {
                ilosc=ilosc+1;
            }
        }
        return ilosc;
    }
}
