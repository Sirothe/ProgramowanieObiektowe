package pl.edu.uwm.po.lab02;

import java.util.Scanner;

public class zad1i {
    public static double dodaiod2() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double suma = 0;
        boolean znak = true;
        silnia sil = new silnia();
        for (int i = 1; i < a; i++) {
            double b =sil.silnia(i);
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            if (!znak) {
                suma = suma - liczba/b;
                znak = true;
            }else {
                suma = suma + liczba/b;
                znak = false;
            }
        }
        return suma;
    }
}
