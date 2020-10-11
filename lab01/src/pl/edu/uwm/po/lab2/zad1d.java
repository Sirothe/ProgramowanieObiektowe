package pl.edu.uwm.po.lab02;

import java.util.Scanner;

public class zad1d {
    public static double dodawanieabspierw() {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        double suma = 0;
        for (int i = 0; i < d; i++) {
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            suma = suma + Math.sqrt(Math.abs(liczba));
        }
        return suma;
    }
}
