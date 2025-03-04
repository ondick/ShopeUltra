
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
            sc.nextLine();

            System.out.println("Znacka: ");
            String znacka = sc.nextLine();

            System.out.println("Model: ");
            String model = sc.nextLine();

            System.out.print("Mira spotreby A, B, C, D, E, F, G: ");


            String energieString = sc.nextLine().toUpperCase();
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
        if (items != null){
        for (Fridge fridge : items){
            if (fridge != null){
                fridge.printInfo();
                }
            }
        }
        System.out.println("-----");
    }
    public void printNarocnost(){
        System.out.println("Ledničky s narocnosti A:");
        if (items != null){
            for (Fridge fridge : items){
                if (fridge != null && fridge.getEnergie() == Energie.A){
                    fridge.printInfo();
                }
            }
        }


        }
        public void printPocetPolozek(){
            System.out.println("počet všech ledniček: " + (items.length));
        }
        public void printZajimavosti(){
            int A=0;
            int B=0;
            int C=0;
            int D=0;
            int E=0;
            int F=0;
            int G=0;
            for (Fridge fridge : items){
               switch (fridge.getEnergie()){
                   case A:A++;
                   break;
                   case B:B++;
                   break;
                   case C:C++;
                   break;
                   case D:D++;
                   break;
                   case E:E++;
                   break;
                   case F:F++;
                   break;
                   case G:G++;
                   break;


               }


            }
            System.out.println(" A: "+A);
            System.out.println(" B: "+B);
            System.out.println(" C: "+C);
            System.out.println(" D: "+D);
            System.out.println(" E: "+E);
            System.out.println(" F: "+F);
            System.out.println(" G: "+G);
    }


}
