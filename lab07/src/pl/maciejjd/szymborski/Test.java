package pl.maciejjd.szymborski;

public class Test {
    public static void main(String[] args) {
        Adres os1= new Adres("Bażantowa","18","10-358","Olsztyn");
        Adres os2= new Adres("Bielska","12", "3","10-520","Olsztyn");
        Adres os3= new Adres("Bielska","12", "3","10-378","Olsztyn");
        os1.pokaz();
        os2.pokaz();
        System.out.println(os1.przed(os2));
        System.out.println(os1.przed(os3));

        Osoba Maciej= new Osoba("Zbysz",1932);
        Student Jasio = new Student("Gawodziej",2001,"mechatronika");
        Nauczyciel Jacek = new Nauczyciel("Szarak",1956,2000);
        System.out.println(Maciej);
        System.out.println(Jasio);
        System.out.println(Jacek);
        System.out.println(Jasio.getKierunek());
        System.out.println(Jasio.getNazwisko());
        System.out.println(Jasio.getRokUrodzenia());
        System.out.println(Jacek.getPensja());

        BetterRectangle recta= new BetterRectangle(1,1,4,3);
        System.out.println(recta.getArea());
        System.out.println(recta.getPerimeter());
    }
}
