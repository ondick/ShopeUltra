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
    public void printInfo(){
        System.out.println(rokVyroby +": "+ energie);
    }

}
