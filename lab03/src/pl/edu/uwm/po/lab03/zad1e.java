package pl.edu.uwm.po.lab03;

import java.util.Random;
import java.util.Scanner;

public class zad1e {
    public static void zad1e() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int temp=0;
        int temp2=0;
        int[] tablica = new int[a];
        Random rand = new Random();
        for(int i = 0;i<a;i++) {
            int liczba = rand.nextInt(1998)-999;
            tablica[i]=liczba;
        }
        for(int i = 0;i<a;i++) {
            if(tablica[i]>0) {
                temp=temp+1;
            }else {
                if(temp2<temp) {
                    temp2=temp;
                }
                temp=0;
            }
        }
        System.out.println("Najwiekszy ciag dodatnich to: " + temp2);
    }
}
