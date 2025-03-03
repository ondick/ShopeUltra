
package elektroshop;
import java.util.Scanner;
public class Items {
    static Scanner sc = new Scanner(System.in);
    private Fridge[] items;


    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu ledniček. A ty prida do pole items.
     * @param count - pozadovany pocet lednicek
     */
    public void addItems(int count) {
        Scanner sc = new Scanner(System.in);
        items = new Fridge[count];

        for (int i=0; i<count; i++){
            System.out.print("Zadej detailz o lednici: "+(i+1));

            System.out.println("Zadej rok vyroby");
            int rokVyroby = sc.nextInt();

            System.out.println("Znacka: ");
            String znacka = sc.nextLine();

            System.out.println("Model: ");
            String model = sc.nextLine();

            System.out.print("Mira spotreby A, B, C, D, E, F, G: ");


            String energieString = sc.nextLine().toLowerCase();
            Energie energie = Energie.valueOf(energieString);
            items[i] = new Fridge(energie,znacka,model,rokVyroby);


            //nacti od uzivatele míru spotreby a rok výroby ledničky
            //pridej lednicku do pole lednicek
        }

    }


    /**
     * Tato metoda vypise informace o lednickach. Na prvnim rádku bude text "-----INFO O LEDNICKACH----- ",
     * na dalsich radkach bude vzdy rok vyroby lednick, dvojtecka a popis spotreby. (Vyuzijte metodu printInfo() tridy Fridge.)
     * Na poslednim radku bude text "-----".
     */
    public void printInfo(){
        System.out.println("-----INFO O LEDNICKACH-----");
        for (int i=0; i<items.length; i++){
            System.out.println(items[i].toString());

        }
        System.out.println("-----");
    }
    public void vypisPolozek(){
        for (Energie energie: Energie.values()){
            System.out.println(energie.toString());


        }

    }
}
