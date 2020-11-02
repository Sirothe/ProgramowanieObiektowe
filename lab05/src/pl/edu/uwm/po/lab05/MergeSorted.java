package pl.edu.uwm.po.lab05;

import java.util.ArrayList;

public class MergeSorted {
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a,ArrayList<Integer> b) {
        ArrayList<Integer> wynik = Append.append(a,b);
        int allsize = a.size()+b.size();

        for(int i=0;i<allsize-1;i++) {
            for(int j=0;j<allsize-i-1;j++) {
                if(wynik.get(j)>wynik.get(j+1)) {
                    int temp = wynik.get(j);
                    wynik.set(j,wynik.get(j+1));
                    wynik.set(j+1,temp);
                }
            }
        }
        return wynik;
    }
}
