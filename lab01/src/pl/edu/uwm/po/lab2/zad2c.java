package pl.edu.uwm.po.lab02;

import java.util.Scanner;

public class zad2c {
    public static int liczkwadparz() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int ilosc=0;
        for (int i = 0; i < a; i++) {
            System.out.println("podaj liczbę");
            int liczba = scan.nextInt();
            int temp = liczba%100;
            if(temp==0) {
                ilosc=ilosc+1;
            }
            if(temp%64!=0) {
                temp=temp-64;
                if(temp%36!=0) {
                    temp=temp-36;
                    if(temp%16!=0) {
                        temp=temp-16;
                        if(temp%4==0) {
                            ilosc=ilosc+1;
                        }
                    }
                }
            }
        }
        return ilosc;
    }
}
