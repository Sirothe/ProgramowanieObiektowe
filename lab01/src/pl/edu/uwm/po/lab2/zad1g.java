package pl.edu.uwm.po.lab02;

import java.util.Scanner;

public class zad1g {
    public static void dodzmno() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double suma1 = 0;
        double suma2 = 1;
        for (int i = 0; i < a; i++) {
            System.out.println("podaj liczbę");
            double liczba = scan.nextDouble();
            suma1 = suma1 + liczba;
            suma2 = suma2 * liczba;
        }
        System.out.print(suma1);
        System.out.print(" ");
        System.out.print(suma2);
    }
}
