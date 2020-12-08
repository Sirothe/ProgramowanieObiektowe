import java.util.LinkedList;

public class Odwroc2<T> implements Comparable<T> {
    public static <T> void odwroc2(LinkedList<T> lista) {
        int temp = lista.size();
        for(int i=temp;i>0;i--) {
            lista.addLast(lista.get(i-1));
        }
        for(int i=0;i<temp;i++) {
            lista.removeFirst();
        }
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
