package pl.edu.uwm.po.lab02;

import java.util.Scanner;
import java.awt.List;

public class zad1j {
    public static void wypisz() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        List lista = new List(1);
        for (int i = 0; i < a; i++) {
            System.out.println("podaj liczbę");
            double liczba = scan.nextInt();
            lista.add(String.valueOf(liczba));
        }
        for(int j=0;j<a;j++) {
            System.out.print(lista.getItem(j+1)+',');
        }
        System.out.print(lista.getItem(0));
    }
}
