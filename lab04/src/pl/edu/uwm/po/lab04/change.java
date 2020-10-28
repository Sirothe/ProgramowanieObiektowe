package pl.edu.uwm.po.lab04;

import java.lang.StringBuffer;

public class change {
    public static String change(String str) {
        StringBuffer temp = new StringBuffer();
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                temp.append(Character.toLowerCase(c));
            }
            else if(c >= 'a' && c <= 'z' ) {
                temp.append(Character.toUpperCase(c));
            }else {
                temp.append(c);
            }
        }
        return temp.toString();

    }
}
