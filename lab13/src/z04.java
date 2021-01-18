import java.util.*;

public class z04 {
    public static void main(String[] args) {
        String tekst = "jestem ale ale fajny fajny siema mordeczko jestem";
        szukaj(tekst);
    }
    public static void szukaj(String txt) {
        Map<Integer,HashSet<String>> mapa = new HashMap<>();
        String[] temp = txt.split(" ");
        ArrayList<Integer> lista = new ArrayList<>();
        for(String s : temp) {
            if(mapa.containsKey(s.hashCode())) {
                HashSet temp2= (HashSet) mapa.get(s.hashCode());
                temp2.add(String.valueOf(s.hashCode()));
                mapa.replace(s.hashCode(),temp2);
                lista.add(s.hashCode());
            }
            else {
                HashSet temp2= new HashSet();
                temp2.add(String.valueOf(s.hashCode()));
                mapa.put(s.hashCode(),temp2);
            }
        }
        for(Integer in: lista) {
            System.out.println(in);
        }
    }

}
