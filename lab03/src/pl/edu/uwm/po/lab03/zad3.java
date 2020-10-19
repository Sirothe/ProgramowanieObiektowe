package pl.edu.uwm.po.lab03;

import java.util.Scanner;
import java.util.Random;

public class zad3 {
    public static void zad3() {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int k = scan.nextInt();
        int temp=0;
        Random rand = new Random();

        int macierz1[][] = new int[m][n];
        int macierz2[][] = new int[n][k];
        int macierzwynik[][] = new int[macierz1.length][macierz2[0].length];

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                int losowa=rand.nextInt(10)+1;
                macierz1[i][j]=losowa;
            }
        }

        for (int i = 0; i < macierz1.length; i++) {
            for (int j = 0; j < macierz1[i].length; j++) {
                System.out.print(macierz1[i][j] + " ");
            }
            System.out.println(); 
        }
        System.out.println();

        for(int i=0;i<n;i++) {
            for(int j=0;j<k;j++) {
                int losowa=rand.nextInt(10)+1;
                macierz2[i][j]=losowa;
            }
        }

        for (int i = 0; i < macierz2.length; i++) { 
            for (int j = 0; j < macierz2[i].length; j++) { 
                System.out.print(macierz2[i][j] + " ");
            }
            System.out.println(); 
        }
        System.out.println();

        if (macierz1[0].length == macierz2.length)
        {
            for(int i=0; i<macierzwynik.length; i++)
            {
                for(int j=0; j<macierzwynik[i].length; j++)
                {
                    for (int g = 0; g < macierz1[0].length; g++) {
                        macierzwynik[i][j] += macierz1[i][g] * macierz2[g][j];
                    }
                }
            }
        }

        for (int i = 0; i < macierzwynik.length; i++) { 
            for (int j = 0; j < macierzwynik[i].length; j++) { 
                System.out.print(macierzwynik[i][j] + " ");
            }
            System.out.println(); 
        }

    }
}
