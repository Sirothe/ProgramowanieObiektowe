package pl.edu.uwm.po.lab03;

import java.util.Random;
import java.util.Scanner;

public class zad1c {
    public static void zad1c() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] tablica = new int[a];
        int w = -1000;
        int wyst = 1;
        Random rand = new Random();
        for(int i = 0;i<a;i++) {
            int liczba = rand.nextInt(1998)-999;
            tablica[i]=liczba;
            if(tablica[i]>w) {
                wyst = 1;
                w=tablica[i];
            }
            if(tablica[i]==w) {
                wyst=wyst+1;
            }
        }
        System.out.println("Najwieksza: " + w);
        System.out.println("Ile razy: " + wyst);
    }
}
