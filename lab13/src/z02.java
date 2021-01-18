import java.util.*;

public class z02 {
    public static void main(String[] args) {
        Map<String,String> mapa = new HashMap<>();
        mapa.put("Joe","db");
        mapa.put("Susan","bdb");
        mapa.put("Carl","db+");

        ArrayList<String> Mapsorted = new ArrayList<>(mapa.keySet());
        Collections.sort(Mapsorted);

        for(String s : Mapsorted) {
            System.out.println(s + ": " + mapa.get(s));
        }

    }

}
