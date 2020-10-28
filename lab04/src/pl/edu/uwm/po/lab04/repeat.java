package pl.edu.uwm.po.lab04;

public class repeat {
    public static String repeat(String str,int n) {
        String temp = str;
        for(int i=1;i<n;i++) {
            temp=temp+str;
        }
        return temp;
    }
}
