package bookstore;


public class Book {
    private String nazev;
    private int rokVydani;
    private int delkaKnihy;
    private Zanr zanr;
    public Book(String nazev, int rokVydani, int delkaKnihy, Zanr zanr) {
        this.nazev = nazev;
        this.rokVydani = rokVydani;
        this.delkaKnihy = delkaKnihy;
        this.zanr = zanr;
    }
    public Zanr getZanr() {
        return zanr;
    }
    public int getDelkaKnihy() {
        return delkaKnihy;
    }
    public void printInfo(){
        System.out.println(nazev+" : ");
        System.out.print(zanr+" : ");
        System.out.print(rokVydani);


    }
}
