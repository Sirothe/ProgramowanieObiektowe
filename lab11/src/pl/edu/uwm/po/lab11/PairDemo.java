package pl.edu.uwm.po.lab11;

public class PairDemo {
    public static void main(String[] args) {
        Pair para = new Pair(3,5);
        System.out.println(para.getFirst());
        System.out.println(para.getSecond());
        para.swap();
        System.out.println(para.getFirst());
        System.out.println(para.getSecond());
    }
}
