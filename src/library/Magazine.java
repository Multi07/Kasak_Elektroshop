package library;

import java.util.Scanner;

public class Magazine implements IItem {

    static Scanner sc = new Scanner(System.in);
    public String name;
    public String redakce;
    public int pages;

    public Magazine() {
        System.out.println("Zadejte Jméno časopisu:");
        name = sc.nextLine();

        System.out.println("Zadejte Jméno redakce");
        redakce = sc.nextLine();

        System.out.println("Zadejte počet stran");
        pages = sc.nextInt();
        sc.nextLine();
        ;
    }
    @Override
    public String printInfo() {
        return "Jméno Knihy: "+name+" Jméno authora: "+redakce+" Počet stran: "+pages;
    }

    @Override
    public void printDelka() {
        System.out.println("Kniha"+name+" má " +pages);
    }
}
