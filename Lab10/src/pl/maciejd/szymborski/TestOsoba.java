package pl.maciejd.szymborski;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestOsoba {
    public static void main(String[] args) {

        ArrayList<Osoba> listaOs = new ArrayList<>(5);
        listaOs.add(new Osoba("Kowalski",LocalDate.of(2000, 10, 5)));
        listaOs.add(new Osoba("Kowalski",LocalDate.of(1999, 9, 3)));
        listaOs.add(new Osoba("Zimbwawe",LocalDate.of(1999, 2, 8)));
        listaOs.add(new Osoba("Goro",LocalDate.of(1999, 2, 8)));
        listaOs.add(new Osoba("Szymborski",LocalDate.of(1999, 10, 21)));
        System.out.println(listaOs.get(0));
        System.out.println(listaOs.get(0).equals(listaOs.get(1)));

        System.out.println(listaOs);
        Collections.sort(listaOs);
        System.out.println(listaOs);



        ArrayList<Osoba> listaSt = new ArrayList<>(5);
        listaSt.add(new Osoba("Kowalski",LocalDate.of(2000, 10, 5)));
        listaSt.add(new Osoba("Kowalski",LocalDate.of(1999, 9, 3)));
        listaSt.add(new Osoba("Zimbwawe",LocalDate.of(1999, 2, 8)));
        listaSt.add(new Osoba("Goro",LocalDate.of(1999, 2, 8)));
        listaSt.add(new Osoba("Szymborski",LocalDate.of(1999, 10, 21)));

        System.out.println(listaSt);
        Collections.sort(listaSt);
        System.out.println(listaSt);



        if (args.length != 0) {
            ArrayList<String> zad3 = new ArrayList<>();
            try {
                File file = new File(args[0]);
                Scanner read = new Scanner(file);
                while (read.hasNextLine()) {
                    zad3.add(read.nextLine());
                }
                read.close();
            } catch (FileNotFoundException e) {
                System.out.println("Brak takiego pliku");
            }

            System.out.println(zad3);
            Collections.sort(zad3);
            System.out.println(zad3);

            //javac -cp . pl/maciejd/szymborski/TestOsoba.java
            //java -cp . pl.maciejd.szymborski.TestOsoba test.txt
        }
    }
}
