package pl.edu.uwm.po.lab04;

public class nice2 {
    public static String nice2(String str,char sep,int n) {
        StringBuffer temp = new StringBuffer();
        char c;
        int count = 0 ;
        int temp2 = str.length()%n;
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
            if(count%n==0 && i!=str.length()-1) {
                temp.append(sep);
            }
        }
        return temp.toString();
    }
}
