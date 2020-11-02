package pl.edu.uwm.po.lab05;

import java.util.ArrayList;

public class Append {
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> wynik = new ArrayList<Integer>();
        wynik.addAll(a);
        wynik.addAll(b);
        return wynik;
    }
}
