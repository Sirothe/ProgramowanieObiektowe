package pl.edu.uwm.po.lab04;

import java.math.BigInteger;

public class szachownica {
    public static BigInteger szachownica(int n) {
        BigInteger wynik = new BigInteger("0");
        BigInteger[][] Array = new BigInteger[n][n];
        Array[0][0] = BigInteger.ONE;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(i==0 && j==0) {
                }else {
                    if(j==0) {
                        Array[i][j]=(Array[i-1][n-1].multiply(BigInteger.TWO));
                    }else {
                        Array[i][j]=(Array[i][j-1].multiply(BigInteger.TWO));
                    }
                }
            }
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                wynik = wynik.add(Array[i][j]);
            }
        }

        return wynik;
    }
}
