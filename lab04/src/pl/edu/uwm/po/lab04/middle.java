package pl.edu.uwm.po.lab04;

public class middle {
    public static String middle(String str) {
        if(str.length()%2==0) {
            return str.substring(str.length()/2-1,str.length()/2+1);
        }else{
            return str.substring(str.length()/2,str.length()/2+1);
        }
    }
}
