package pl.edu.uwm.po.lab02;

public class silnia {
    public static double silnia(int n) {
        double silnia = 1;
        for (int i = 1; i <= n; i++) {
            silnia = silnia * i;
        }
        return silnia;
    }
}
