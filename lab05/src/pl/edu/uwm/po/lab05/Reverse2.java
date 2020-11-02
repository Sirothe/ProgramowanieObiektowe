package pl.edu.uwm.po.lab05;

import java.util.ArrayList;

public class Reverse2 {
    public static void reverse(ArrayList<Integer> a) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp = Reverse.reversed(a);
        for(int i=0;i<a.size();i++) {
            a.set(i,temp.get(i));
        }
    }
}
