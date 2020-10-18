package pl.edu.uwm.po.lab03;

public class zad2f {
    public static void signum(int tab[]) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                tab[i] = 1;
            } else if (tab[i] < 0) {
                tab[i] = -1;
            }
        }
    }
}
