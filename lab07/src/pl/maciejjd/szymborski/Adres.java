package pl.maciejjd.szymborski;

public class Adres {
    public Adres(String ulica, String numer_domu, String kod_pocztowy, String miasto) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.kod_pocztowy = kod_pocztowy;
        this.miasto = miasto;
    }

    public Adres(String ulica, String numer_domu, String numer_mieszkania, String kod_pocztowy, String miasto) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.kod_pocztowy = kod_pocztowy;
        this.miasto = miasto;
    }
    public void pokaz(){
        System.out.println(this.kod_pocztowy+" "+this.miasto);
        System.out.print(this.ulica+" "+this.numer_domu);
        if(!this.numer_mieszkania.equals("0")){
            System.out.print("/"+this.numer_mieszkania);
        }
        System.out.println();
    }
    public boolean przed(Adres kod_poczt){
        int[] tab={0,1,3,4,5};
        StringBuilder first= new StringBuilder();
        StringBuilder prev = new StringBuilder();
        for(int i : tab){
            first.append(kod_poczt.kod_pocztowy.charAt(i));
            prev.append(this.kod_pocztowy.charAt(i));
        }
        int fir=Integer.parseInt(first.toString());
        int pre=Integer.parseInt(prev.toString());
        return fir<pre;
    }

    private String ulica;
    private String numer_domu;
    private String numer_mieszkania = "0";
    private String miasto;
    private String kod_pocztowy;
}
