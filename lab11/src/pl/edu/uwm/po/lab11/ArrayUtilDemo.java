package pl.edu.uwm.po.lab11;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        System.out.println(ArrayUtil.isSorted(test));
        test.add(1);
        System.out.println(ArrayUtil.isSorted(test));
        System.out.println(ArrayUtil.binSearch(test,1));
        System.out.println(ArrayUtil.binSearch(test,12));
        ArrayList<Integer> test2 = new ArrayList<>();
        test2.add(6);
        test2.add(5);
        test2.add(7);
        ArrayList<LocalDate> test22 = new ArrayList<>();
        test22.add(LocalDate.of(1000,10,11));
        test22.add(LocalDate.of(2000,10,11));
        test22.add(LocalDate.of(1987,10,11));
//        ArrayUtil.selectionSort(test2);
//        ArrayUtil.selectionSort(test22);
//        for(int i=0;i<test2.size();i++) {
//            System.out.println(test2.get(i));
//        }
//        for(int i=0;i<test22.size();i++) {
//            System.out.println(test22.get(i));
//        }
        ArrayUtil.mergeSort(test2);
        ArrayUtil.mergeSort(test22);
        for(int i=0;i<test2.size();i++) {
            System.out.println(test2.get(i));
        }
        for(int i=0;i<test22.size();i++) {
            System.out.println(test22.get(i));
        }
    }
}
