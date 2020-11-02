package pl.edu.uwm.po.lab05;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        /*ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(3);
        a.add(5);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(2);
        b.add(4);
        b.add(6);

        ArrayList<Integer> wynik = new ArrayList<Integer>();
        wynik = Append.append(a,b);
        for(int i: wynik) {
            System.out.print(i + " ");
        }
        System.out.println();

        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(3);
        a1.add(5);
        ArrayList<Integer> b1 = new ArrayList<Integer>();
        b1.add(2);
        b1.add(4);
        b1.add(6);
        b1.add(10);
        b1.add(11);

        ArrayList<Integer> wynik1 = new ArrayList<Integer>();
        wynik1 = Merge.merge(a1,b1);
        for(int i: wynik1) {
            System.out.print(i + " ");
        }

        System.out.println();
*/
        /*ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(5);
        a2.add(1);
        a2.add(3);
        ArrayList<Integer> b2 = new ArrayList<Integer>();
        b2.add(4);
        b2.add(6);
        b2.add(2);

        ArrayList<Integer> wynik2 = new ArrayList<Integer>();
        wynik2 = MergeSorted.mergeSorted(a2,b2);
        for(int i: wynik2) {
            System.out.print(i + " ");
        }

        System.out.println();

        ArrayList<Integer> c = new ArrayList<Integer>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        c.add(6);
        ArrayList<Integer> wynikc = new ArrayList<Integer>();
        wynikc = Reverse.reversed(c);
        for(int i : wynikc) {
            System.out.print(i + " ");*/

        ArrayList<Integer> wynik = new ArrayList<Integer>();
        wynik.add(1);
        wynik.add(2);
        wynik.add(3);
        wynik.add(4);
        wynik.add(5);
        wynik.add(6);
        Reverse2.reverse(wynik);
        for(int i: wynik) {
            System.out.print(i + " ");
        }
    }
}
