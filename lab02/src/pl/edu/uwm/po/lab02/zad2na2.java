package pl.edu.uwm.po.lab02;

import java.util.Scanner;

public class zad2na2 {
    public static double podsumdod() {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        double suma=0;
        for(int i=0;i<d;i++) {
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            if(liczba>0) {
                suma=suma+liczba;
            }
        }
        return 2*suma;
    }
}
