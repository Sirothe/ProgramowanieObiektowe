
public class student implements Comparable<student> {
    private String imie;
    private String nazwisko;
    private Integer id;

    public student(String imie, String nazwisko, Integer id) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int compareTo(student o) {
        int c = this.getNazwisko().compareTo(o.getNazwisko());
        if (c==0) {
            c= this.getImie().compareTo(o.getImie());
        }
        if (c==0) {
            c= this.getId().compareTo(o.getId());
        }
        return c;
    }
}
