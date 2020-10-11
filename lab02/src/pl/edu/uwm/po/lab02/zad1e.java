package pl.edu.uwm.po.lab02;

import java.util.Scanner;

public class zad1e {
    public static double mnozenieabs() {
        Scanner scan = new Scanner(System.in);
        int e = scan.nextInt();
        double suma = 1;
        for (int i =0;i<e;i++) {
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            suma = suma * Math.abs(liczba);
        }
        return suma;
    }
}
