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
			Book kniha = new Book();
			items[i] = kniha;
		}
	}


	public void printInfo() {
		System.out.println("-----INFO O KNIHOVNE-----");
		for (int i = 0; i < items.length; i++) {System.out.println(items[i].printInfo());}
		System.out.println("-----");
	}

	public void printDelka() {
		for (int i = 0; i < items.length; i++) {
			System.out.println("Kniha"+items[i].name+" má " +items[i].pages);
		}
	}
}

