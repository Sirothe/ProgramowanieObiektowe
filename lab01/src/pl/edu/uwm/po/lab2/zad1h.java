package pl.edu.uwm.po.lab02;

import java.util.Scanner;

public class zad1h {
    public static double dodiod() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double suma = 0;
        boolean znak = true;
        for (int i = 0; i < a; i++) {
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            if (!znak) {
                suma = suma - liczba;
                znak = true;
            }else {
                suma = suma + liczba;
                znak = false;
            }
        }
        return suma;
    }
}
