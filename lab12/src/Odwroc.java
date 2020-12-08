import java.util.LinkedList;

public class Odwroc {
    public static void odwroc(LinkedList<String> lista) {
        int temp = lista.size();
        for(int i=temp;i>0;i--) {
            lista.addLast(lista.get(i-1));
        }
        for(int i=0;i<temp;i++) {
            lista.removeFirst();
        }
    }
}
