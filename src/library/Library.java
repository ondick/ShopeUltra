package library;
import java.util.Scanner;
public class Library {
	Scanner sc = new Scanner(System.in);
	private Book[] items;
	private Magazine[] casopisy;
	public void addItems(int count) {
		Scanner sc = new Scanner(System.in);
		System.out.println("kolik nagazinu chces priat?");
		int pocetCasopisu = sc.nextInt();
		sc.nextLine();
		casopisy = new Magazine[pocetCasopisu];
	}

	public void addItems(int count) {
		  items = new Book[count];
		for (int i=0; i<count; i++){
			Book book = new Book();
			items[i] = book;
			//vytvor instanci
			//pridej instanci do pole

		}
	}

	public void printInfo(){
		System.out.println("-----INFO O KNIHOVNE-----");
		//sem dopln kod
		for (Book book : items){
			book.printInfo();
		}
		System.out.println("-----");
	}
}
