import java.util.*;
import java.util.stream.*;

public class z03 {
    public static void main(String[] args) {
        Map<student,String> mapa = new HashMap<>();
        student s1 = new student("joe","pierwszy",0);
        student s2 = new student("Carl","pierwszy",1);
        student s3 = new student("Susan","pierwszy",2);
        mapa.put(s1,"db");
        mapa.put(s2,"bdb");
        mapa.put(s3,"db+");
        showMap(mapa);

    }
    public static void usunOcene(Integer id, Map mapa) {
        ArrayList<student> temp = new ArrayList<student>(mapa.keySet());
        for(student st: temp) {
            if(st.getId().equals(id)) {
                mapa.remove(st);
            }
        }
    }
    public static void zmienOcene(Integer id, String ocena, Map<student, String> mapa) {
        ArrayList<student> temp = new ArrayList<student>(mapa.keySet());
        for(student st: temp) {
            if(st.getId().equals(id)) {
                mapa.replace(st,ocena);
            }
        }
    }
    public static void showMap(Map mapa) {
        ArrayList<student> temp = new ArrayList<student>(mapa.keySet());
        Collections.sort(temp);
        for(student st: temp) {
            System.out.println(st.getNazwisko()+" "+st.getImie()+" "+st.getId()+": "+mapa.get(st));
        }
    }
}
