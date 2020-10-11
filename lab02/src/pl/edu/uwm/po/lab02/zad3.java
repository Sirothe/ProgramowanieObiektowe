package pl.edu.uwm.po.lab02;

import java.util.Scanner;

public class zad3 {
    public static void grupowanie() {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int suma0=0; //dodatnie
        int suma1=0; //ujemne
        int suma2=0; //zera
        for(int i=0;i<d;i++) {
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            if(liczba>0) {
                suma0=suma0+1;
            }else if(liczba<0) {
                suma1=suma1+1;
            }else {
                suma2=suma2+1;
            }
        }
        System.out.println("Ilosc liczb dodatnich" + suma0);
        System.out.println("Ilosc liczb ujemnych" + suma1);
        System.out.println("Ilosc zer" + suma2);
    }
}
