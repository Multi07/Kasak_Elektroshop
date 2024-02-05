package library;

import elektroshop.Type;

public class Book {
    public String name;
    public String author;
    public int pages;


    public Book(String name, String author, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }


    public String PrintInfo() {
        return "Jméno Knihy: "+name+" Jméno authora: "+author+" Počet stran: "+pages;
    }

    public void printDelka() {
            System.out.println("Kniha"+name+" má " +pages);
    }

}