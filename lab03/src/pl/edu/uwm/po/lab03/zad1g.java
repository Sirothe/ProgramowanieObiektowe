package pl.edu.uwm.po.lab03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class zad1g {
    public static void zad1g() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] tablica = new int[a];
        int lewy = scan.nextInt();
        int prawy = scan.nextInt();
        int temp=0;
        int temptab=0;
        if(lewy>prawy || lewy>a || prawy>a) {
            System.out.println("Wystapil blad przy wczytywaniu liczby");
            System.out.println("Zasady");
            System.out.println("Lewy nie moze byc wiekszy od prawego");
            System.out.println("Prawy nie moze byc wiekszy od lewego");
            System.out.println("Lewy i Prawy nie moga byc wieksze od n");
        }
        Random rand = new Random();
        for(int i = 0;i<a;i++) {
            int liczba = rand.nextInt(1998) - 999;
            tablica[i] = liczba;
        }
        System.out.println("Przed zmianami");
        System.out.println(Arrays.toString(tablica));
        for(int i=lewy;i<prawy-1;i++) {
            temptab=tablica[i];
            tablica[i]=tablica[prawy-temp];
            tablica[prawy-temp]=temptab;
            temp++;
        }
        System.out.println("Po zmianach");
        System.out.println(Arrays.toString(tablica));
    }
}
