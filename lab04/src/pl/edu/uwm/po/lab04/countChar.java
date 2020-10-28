package pl.edu.uwm.po.lab04;

public class countChar {
    public static int countChar(String str,char c) {
        char[] temp = str.toCharArray();
        int counter = 0;
        for(int i=0;i<str.length();i++) {
            if(temp[i]==c) {
                counter++;
            }
        }
        return counter;
    }
}
