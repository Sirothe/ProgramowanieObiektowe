package pl.edu.uwm.po.lab02;

import java.util.Scanner;

public class zad1b {
    public static double mnozenie() {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        double suma = 1;
        for (int i =0;i<b;i++) {
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            suma = suma * liczba;
        }
        return suma;
    }
}
