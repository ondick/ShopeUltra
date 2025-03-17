package library;
import java.util.Scanner;
public class Book implements IItem{
    Scanner sc = new Scanner(System.in);
private String nazev;
private String autor;
private int pocetStran;
public Book() {
    System.out.println("Zadej nazev knihy:");
    nazev = sc.nextLine();
    System.out.println("Zadej autor knihy:");
    autor = sc.nextLine();
    System.out.println("Zadej pocet stran:");
    pocetStran = sc.nextInt();
}
    public void printInfo() {
        System.out.println("Kniha s názvem "+nazev+" má "+pocetStran+" stran a napsal ji "+autor);

    }
    public void printDelka() {
        System.out.println("Kniha s názvem  má "+pocetStran+" stran");

    }
}
