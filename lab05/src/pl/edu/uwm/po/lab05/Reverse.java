package pl.edu.uwm.po.lab05;

import java.util.ArrayList;

public class Reverse {
    public static ArrayList<Integer> reversed(ArrayList<Integer> a ) {
        ArrayList<Integer> wynik = new ArrayList<Integer>();
        for(int i=0;i<a.size();i++) {
            wynik.add(a.get(a.size()-1-i));
        }
        return wynik;
    }
}
