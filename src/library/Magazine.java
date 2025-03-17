package library;
import java.util.Scanner;
public class Magazine implements IItem{
    Scanner sc = new Scanner(System.in);
    private String name;
    private String author;
    private int pocetStran;
    public Magazine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej nazev knihy:");
        this.name = sc.nextLine();
        System.out.println("Zadej autor knihy:");
        this.author = sc.nextLine();
        System.out.println("Zadej pocet stran:");
        this.pocetStran = sc.nextInt();
    }
    @Override
    public void printInfo(){
        System.out.println("Magazine title: " + name+" author: " + author+" pocet Stran: " + pocetStran);
    }
    public void printDelka(){
        System.out.println("Kniha ma " + pocetStran+" stran");
    }
}
