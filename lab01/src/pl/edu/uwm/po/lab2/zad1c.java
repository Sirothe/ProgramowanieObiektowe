package pl.edu.uwm.po.lab02;

import java.util.Scanner;

public class zad1c {
    public static double dodawanieabs() {
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        double suma = 0;
        for (int i = 0; i < c; i++) {
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            suma = suma + Math.abs(liczba);
        }
        return suma;
    }
}
