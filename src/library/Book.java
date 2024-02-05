package library;
import java.util.Scanner;

import elektroshop.Type;

import java.util.Scanner;

public class Book implements IItem{
    static Scanner sc = new Scanner(System.in);
    public String name;
    public String author;
    public int pages;


    public int getPages() {
        return pages;
    }

    public Book() {
        System.out.println("Zadejte Jméno Knihy:");
        name = sc.nextLine();

        System.out.println("Zadejte Jméno Autora");
        author = sc.nextLine();

        System.out.println("Zadejte počet stran");
        pages = sc.nextInt();
        sc.nextLine();
        ;
    }

    public String printInfo() {
        return "Jméno Knihy: "+name+" Jméno authora: "+author+" Počet stran: "+pages;
    }


    public void printDelka() {
            System.out.println("Kniha"+name+" má " +pages);
    }

}