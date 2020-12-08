import java.util.Iterator;

public class Print {
    public static <T extends Iterable<?>> void print(T object ){
        Iterator<?> it= object.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
            if (it.hasNext()){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
