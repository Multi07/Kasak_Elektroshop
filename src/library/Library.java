package library;
import java.util.Scanner;


import elektroshop.Fridge;
import elektroshop.Type;

public class Library {
	static Scanner sc = new Scanner(System.in);
	private Book[] items;

	public void addItems(int count) {
		items = new Book[count];
		for (int i = 0; i < count; i++) {
			System.out.println("Zadejte Jméno Knihy:");
			String name = sc.nextLine();

			System.out.println("Zadejte Jméno Autora");
			String author = sc.nextLine();

			System.out.println("Zadejte počet stran");
			int pages = sc.nextInt();
			sc.nextLine();
			items[i] = new Book(name, author, pages);
		}
	}


	public void printInfo() {
		System.out.println("-----INFO O KNIHOVNE-----");
		Book BOOK = items[0];
		for (int i = 0; i < items.length; i++) {
			BOOK = items[i];
			System.out.println(BOOK.PrintInfo());
		}
		System.out.println("-----");
	}

	public void printDelka() {
		for (int i = 0; i < items.length; i++) {
			System.out.println("Kniha"+items[i].name+" má " +items[i].pages);
		}
	}
}

