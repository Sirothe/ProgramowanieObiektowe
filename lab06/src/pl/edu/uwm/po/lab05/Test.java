package pl.edu.uwm.po.lab05;

public class Test {
    public static void main(String[] args) {
        RachunekBankowy saver1 = new RachunekBankowy(2000.0);
        RachunekBankowy saver2 = new RachunekBankowy(3000.0);
        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println(saver1.getSaldo());
        System.out.println(saver2.getSaldo());
        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println(saver1.getSaldo());
        System.out.println(saver2.getSaldo());

        IntegerSet A = new IntegerSet();
        IntegerSet B = new IntegerSet();
        A.insertElement(3);
        A.insertElement(11);
        A.insertElement(50);
        A.insertElement(77);
        A.insertElement(91);
        B.insertElement(2);
        B.insertElement(7);
        B.insertElement(13);
        B.insertElement(50);
        B.insertElement(97);
        System.out.println(A);
        System.out.println(B);
        System.out.println(IntegerSet.union(A,B));
        System.out.println(IntegerSet.intersection(A,B));
        A.deleteElement(50);
        System.out.println(A);
        System.out.println(A.equals(B));
        IntegerSet C = new IntegerSet();
        C.insertElement(3);
        C.insertElement(11);
        C.insertElement(77);
        C.insertElement(91);
        System.out.println(A.equals(C));

        Pracownik[] personel = new Pracownik[3];

        // wypełnij tablicę danymi pracowników
        personel[0] = new Pracownik("Pracownik A", 73000, 2002, 10, 15);
        personel[1] = new Pracownik("Pracownik B", 42000, 1999, 11, 1);
        personel[2] = new Pracownik("Pracownik C", 38000, 2004, 3, 17);

        // zwiększ pobory każdego pracownika o 20%
        for (Pracownik e : personel) {
            e.zwiekszPobory(20);
        }

        for (Pracownik e : personel) {
            System.out.print("nazwisko = " + e.nazwisko() + "\tpobory = " + e.pobory());
            System.out.printf("\tdataZatrudnienia = %tF\n", e.dataZatrudnienia());
        }
        System.out.println();
    }
}
