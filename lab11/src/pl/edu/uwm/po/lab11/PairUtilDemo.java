package pl.edu.uwm.po.lab11;

public class PairUtilDemo {
    public static void main(String[] args) {
        Pair para = new Pair(3,5);
        Pair pararev = PairUtil.swap(para);
        System.out.println(para.getFirst());
        System.out.println(para.getSecond());
        System.out.println("-----------------");
        System.out.println(pararev.getFirst());
        System.out.println(pararev.getSecond());
    }
}
