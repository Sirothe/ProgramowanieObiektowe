package pl.edu.uwm.po.lab04;

import java.math.BigDecimal;
import java.math.MathContext;

public class kapital {
    public static BigDecimal kapital(double k, double p, int n) {
        BigDecimal wynik = new BigDecimal(k);
        MathContext help = new MathContext(2);
        for (int i = 0; i < n; i++) {
            BigDecimal temp = wynik.multiply(BigDecimal.valueOf(p), help);
            wynik = wynik.add(temp);
        }
        return wynik;
    }
}