package pl.edu.uwm.po.lab05;

import java.util.ArrayList;

public class Merge {

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> wynik = new ArrayList<Integer>();
        boolean check = true;
        int allsize = a.size() + b.size();
        for(int i=0;i<allsize;i++) {
            if(check) {
                wynik.add(a.get(0));
                a.remove(0);
                check=false;
                if(a.isEmpty()) {
                    wynik.addAll(b);
                    return wynik;
                }
            }else {
                wynik.add(b.get(0));
                b.remove(0);
                check=true;
                if(b.isEmpty()) {
                    wynik.addAll(a);
                    return wynik;
                }
            }
        }
        return wynik;
    }
}
