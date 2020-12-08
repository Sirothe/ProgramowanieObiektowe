import java.util.LinkedList;

public class Redukuj2<T> implements Comparable<T> {
    public static <T> void redukuj2(LinkedList<T> pracownicy, int n) {
        for(int i = n-1; i<pracownicy.size(); i=i+n-1) {
            pracownicy.remove(i);
        }
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
