import java.util.LinkedList;

public class Redukuj {
    public static void redukuj(LinkedList<String> pracownicy,int n) {
        for(int i = n-1; i<pracownicy.size(); i=i+n-1) {
            pracownicy.remove(i);
        }
    }
}
