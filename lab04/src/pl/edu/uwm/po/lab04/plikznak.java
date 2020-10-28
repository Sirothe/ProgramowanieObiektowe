package pl.edu.uwm.po.lab04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class plikznak {
    public static void plikznak(String[] args) {
        int counter = 0 ;
        countChar counting = new countChar();
        try {
            File myFile = new File(args[0]);
            Scanner myReader = new Scanner(myFile);

            while(myReader.hasNextLine()) {
                String line = myReader.nextLine();
                counter += counting.countChar(line,args[1].charAt(0));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Brak takiego pliku");
            e.printStackTrace();
        }
        System.out.println("Znaleziono " + counter + " znakow");
    }
}
