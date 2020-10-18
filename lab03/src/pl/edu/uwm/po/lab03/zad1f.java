package pl.edu.uwm.po.lab03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class zad1f {
    public static void zad1f() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] tablica = new int[a];
        int w = 0;
        int m = 0;
        Random rand = new Random();
        for(int i = 0;i<a;i++) {
            int liczba = rand.nextInt(1998)-999;
            tablica[i]=liczba;
        }
        for(int i=0;i<a;i++) {
            if(tablica[i]<0) {
                tablica[i]=-1;
            } else if (tablica[i]>0) {
                tablica[i]=1;
            }
        }
        System.out.println(Arrays.toString(tablica));
    }
}
