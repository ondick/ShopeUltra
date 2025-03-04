package elektroshop;

public class Fridge {
    private Energie energie;
    private String model;
    private String znacka;
    private int rokVyroby;

    public Fridge(Energie energie, String model, String znacka, int rokVyroby) {
        this.energie = energie;
        this.model = model;
        this.znacka = znacka;
        this.rokVyroby = rokVyroby;
    }

    public Energie getEnergie() {
        return energie;
    }

    public int getRokVyroby() {
        return rokVyroby;
    }
public void printInfo(){
    System.out.print(getRokVyroby()+": ");
    switch (energie){
        case A:
            System.out.println("very low");
            break;
        case B:
            System.out.println("low");
            break;
        case C:
            System.out.println("normal");
            break;
        case D:
            System.out.println("above normal");
            break;
        case F:
            System.out.println("high");
            break;
        case G:
            System.out.println("extremly high");
            break;
    }
}
}