package pl.edu.uwm.po.lab04;

import java.math.BigInteger;
import java.util.Arrays;

public class szachownica {
    public static BigInteger szachownica(int n) {
        BigInteger wynik = new BigInteger(String.valueOf(0));
        int[][] Array = new int[n][n];
        Array[0][0] = 1;
        int help = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(i==0 && j==0) {
                }else {
                    if(j==0) {
                        Array[i][j]=Array[i-1][n-1];
                    }else {
                        Array[i][j]=Array[i][j-1]*2;
                    }
                }
            }
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                help = Array[i][j];
                wynik = wynik.add(BigInteger.valueOf(help));
            }
        }

        return wynik;
    }
}
