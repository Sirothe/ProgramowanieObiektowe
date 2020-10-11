package pl.edu.uwm.po.lab02;

import java.util.Scanner;

public class zad2a {
    public static int liczniep() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int sprawdz = 0;
        for (int i = 0; i < a; i++) {
            System.out.println("podaj liczbę");
            int liczba = scan.nextInt();
            if(liczba%2!=0) {
                sprawdz=sprawdz+1;
            }

        }
        return sprawdz;
    }
}
