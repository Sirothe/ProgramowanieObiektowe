package pl.edu.uwm.po.lab03;

import java.util.Scanner;
import java.util.Random;

public class zad1a {
    public static void zad1a() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] tablica = new int[a];
        int parzyste = 0;
        int nieparzyste = 0;
        Random rand = new Random();
        for(int i = 0;i<a;i++) {
            int liczba = rand.nextInt(1998)-999;
            tablica[i]=liczba;
        }
        for(int i=0;i<a;i++) {
            if(tablica[i]%2==0) {
                parzyste=parzyste+1;
            }else {
                nieparzyste=nieparzyste+1;
            }
        }
        System.out.println(parzyste);
        System.out.println(nieparzyste);
    }
}
