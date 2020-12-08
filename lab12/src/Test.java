import java.util.HashSet;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> pracownicy = new LinkedList<>();
        pracownicy.add("pracownik0");
        pracownicy.add("pracownik1");
        pracownicy.add("pracownik2");
        pracownicy.add("pracownik3");
        pracownicy.add("pracownik4");
        System.out.println(pracownicy);
        Redukuj.redukuj(pracownicy,2);
        System.out.println(pracownicy);

        LinkedList<Integer> liczby = new LinkedList<>();
        liczby.add(0);
        liczby.add(1);
        liczby.add(2);
        liczby.add(3);
        liczby.add(4);
        System.out.println(liczby);
        Redukuj2.redukuj2(liczby,2);
        System.out.println(liczby);

        Odwroc.odwroc(pracownicy);
        Odwroc2.odwroc2(liczby);

        System.out.println(pracownicy);
        System.out.println(liczby);

        System.out.println(StackReverse.stackReverse("Ala ma kota. Jej kot lubi myszy."));

        HashSet<Double> liczbyHash = new HashSet<>();
        liczbyHash.add(3.55);
        liczbyHash.add(2.15);
        liczbyHash.add(2.37);
        liczbyHash.add(1.12);
        liczbyHash.add(8.30);

        Print.print(liczbyHash);
    }
}
