package pl.edu.uwm.po.lab04;

public class countSubStr {
    public static int countSubStr(String str,String subStr) {
        int count = (str.split(subStr,-1).length)-1;
        return count;
    }
}
