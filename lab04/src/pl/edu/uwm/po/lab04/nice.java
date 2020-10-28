package pl.edu.uwm.po.lab04;

public class nice {
    public static String nice(String str) {
        StringBuffer temp = new StringBuffer();
        char c;
        char sep = ',';
        int count = 0 ;
        int temp2 = str.length()%3;
        for(int i=0;i<temp2;i++) {
            c = str.charAt(i);
            temp.append(c);
            if(i==temp2-1) {
                temp.append(sep);
            }
        }
        for(int i=temp2;i<str.length();i++) {
            c=str.charAt(i);
            temp.append(c);
            count=count+1;
            if(count%3==0 && i!=str.length()-1) {
                temp.append(sep);
            }
        }
        return temp.toString();
    }
}
