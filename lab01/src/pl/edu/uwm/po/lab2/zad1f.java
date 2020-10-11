package pl.edu.uwm.po.lab02;

import java.util.Scanner;

public class zad1f {
    public static double dodawaniepow() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double suma = 0;
        for (int i = 0; i < a; i++) {
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            suma = suma + Math.pow(liczba,2);
        }
        return suma;
    }
}
