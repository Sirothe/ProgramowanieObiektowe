package pl.edu.uwm.po.lab04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class plikwyraz {
    public static void plikwyraz(String[] args) {
        int counter = 0 ;
        countSubStr counting = new countSubStr();
        try {
            File myFile = new File(args[0]);
            Scanner myReader = new Scanner(myFile);

            while(myReader.hasNextLine()) {
                String line = myReader.nextLine();
                counter += counting.countSubStr(line,args[1]);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Brak takiego pliku");
            e.printStackTrace();
        }
        System.out.println("Znaleziono " + counter + " wyrazow");
    }
}
