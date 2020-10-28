package pl.edu.uwm.po.lab04;

import java.util.Arrays;

public class where {
    public static int[] where(String str, String subStr) {
        int[] temp = new int[0];
        String strFind = "Java";
        int fromIndex = 0;
        while ((fromIndex = str.indexOf(subStr, fromIndex)) != -1 ){
            temp= Arrays.copyOf(temp,temp.length+1);
            temp[temp.length-1]=fromIndex;
            fromIndex++;
        }
        return temp;
    }
}
