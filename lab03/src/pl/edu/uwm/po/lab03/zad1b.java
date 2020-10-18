package pl.edu.uwm.po.lab03;

import java.util.Random;
import java.util.Scanner;

public class zad1b {
    public static void zad1b() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] tablica = new int[a];
        int w = 0;
        int m = 0;
        int r = 0;
        Random rand = new Random();
        for(int i = 0;i<a;i++) {
            int liczba = rand.nextInt(1998)-999;
            tablica[i]=liczba;
        }
        for(int i=0;i<a;i++) {
            if(tablica[i]>0) {
                m=m+1;
            }else if (tablica[i]==0) {
                r=r+1;
            }else if (tablica[i]<0) {
                w=w+1;
            }
        }
        System.out.println("Wieksze: " + w);
        System.out.println("Mniejsze: " + m);
        System.out.println("Rowne: " + r);
    }
}
