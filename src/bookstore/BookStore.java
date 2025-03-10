package bookstore;
import elektroshop.Energie;
import elektroshop.Fridge;

import java.util.Scanner;

public class BookStore {
    private String name;
    private Book[] books;
    Scanner sc = new Scanner(System.in);

    public BookStore(String name) {
        this.name = name;
    }

    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu knih. A ty prida do pole knih.
     */
    public void addBoooks(int count) {
        Scanner sc = new Scanner(System.in);//spravne cislo nacti od uzivatele, použij scanner

        books = new Book[count];

        for (int i=0; i<count; i++){
            System.out.println("Zadej detailz o knize: "+(i+1));

            System.out.println("Zadej nazev knihy ");
            String nazev = sc.nextLine();

            System.out.println("Zadej rok vydani: ");
            int rokVydani = sc.nextInt();

            System.out.println("Zadej pocet stranek: ");
            int delkaKnihy = sc.nextInt();

            System.out.print("Napiš žánr knihy(roman,scifi,detektivka): ");

            String zanrString = sc.nextLine().toLowerCase();
            Zanr zanr = Zanr.valueOf(zanrString);
            books[i] = new Book(nazev,rokVydani,delkaKnihy,zanr);
        }

    }

    /**
     * Tato metoda vypise informace o knihach. Na prvnim rádku bude text "-----INFO O KNIHKUPECTVI----- ", na druhem bude název KNIHKUPECTVI a tecka.
     * Na tretim radku bude text "na sklade mame tyto knihy:" a následne budou vypsany vsichny knihy oddelene od sebe stredniken a to ve formátu "nazev : zanr : rok vydani" (Vyuzijte metodu printInfo() tridy Book.)
     * Na poslednim radku bude text "-----".
     */
    public void printInfo(){
        System.out.println("-----INFO O KNIHKUPECTVI-----");
        System.out.println(name+".");
        System.out.println("Na skladě máme tyto knihy: ");
        for (int i=0; i<books.length; i++){
            books[i].printInfo();
        }



        System.out.println("-----");
    }
    public void printDelkaKnihy(){



    }

}
