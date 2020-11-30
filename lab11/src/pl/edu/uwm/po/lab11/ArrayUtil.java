package pl.edu.uwm.po.lab11;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtil<T>{
    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> array) {
        ArrayList<T> temp = new ArrayList<>(array);
        Collections.sort(temp);
        return array.equals(temp);
    }
    public static <T extends Comparable<? super T>> int binSearch(ArrayList<T> array,T element) {
        for(int i=0;i<array.size();i++) {
            if(element.equals(array.get(i))) {
                return i;
            }
        }
        return -1;
    }
    public static <T extends Comparable<? super T>> void selectionSort(ArrayList<T> array) {
        int n = array.size();
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (array.get(j).compareTo(array.get(min_idx))<0)
                    min_idx = j;
            T temp = array.get(min_idx);
            array.set(min_idx,array.get(i));
            array.set(i,temp);
        }
    }
    public static <T extends Comparable<? super T>> void mergeSort(ArrayList<T> array) {
        if (array.size() > 1) {
            ArrayList<T> left = new ArrayList<>();
            ArrayList<T> right = new ArrayList<>();
            boolean check = true;
            while (!array.isEmpty()) {
                if (check) {
                    left.add(array.remove(0));
                } else {
                    right.add(array.remove(array.size()/2));
                }
                check = !check;
            }
            mergeSort(left);
            mergeSort(right);
            while (!left.isEmpty() && !right.isEmpty()) {
                if(left.get(0).compareTo(right.get(0)) <= 0){
                    array.add(left.remove(0));
                }
                else {
                    array.add(right.remove(0));
                }
            }
            if(!left.isEmpty()) {
                array.addAll(left);
            }
            else if (!right.isEmpty()) {
                array.addAll(right);
            }
        }
    }
}