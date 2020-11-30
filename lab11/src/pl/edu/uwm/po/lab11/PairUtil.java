package pl.edu.uwm.po.lab11;

public class PairUtil<T> {
    public static <T> Pair<T> swap(Pair<T> para) {
        Pair temp = new Pair(para.getSecond(),para.getFirst());
        return temp;
    }
}
