package autosaloon;

import java.util.Scanner;

import static autosaloon.Condition.damaged;

public class CarDatabase {
    static Scanner sc = new Scanner(System.in);

    public String owner;
    public Car[] cars;

    public CarDatabase(String owner) {
        this.owner = owner;
    }

    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu aut. A ty prida do pole aut.
     * @param count - pozadovany pocet aut
     */
    public void addCars(int count) {
        cars = new Car[count];
        for (int i=0; i<count; i++){
            System.out.println("Zadejte rok Vyroby:");
            int rokVyroby = sc.nextInt();

            System.out.println("Zadejte pocet ujetých KM:");
            int ujeteKM = sc.nextInt();
            sc.nextLine();

            System.out.println("Zadejte Barvu:");
            String barva = sc.nextLine();

            System.out.println("Zadejte Condici auta:");
            String condition = sc.nextLine();

            cars[i] = new Car(rokVyroby, ujeteKM, barva, condition);
        }

    }

    /**
     * Vypise vsechna auta, jejijz stav je "good". Vypis bude ve formatu: Na prvnim radku bude vypis: Dobra auta jsou: .
     * Na kazdem dalsim radku bude vypis informaci o jednom aute - pouzij mezodu printInfo() tridy Car
     */
    public void printCarInGoodCondition(){
        System.out.println("dobrá auto jsou: ");
        for (int i=0;i<cars.length;i++)
            if (cars[i].condition.equals("good")) {
                System.out.println(cars[i].printinfo());
            }
    }

    public void nejviceujeteKM() {
        Car nejviceujeteKM = cars[0];
        for (int b=0;b<cars.length;b++) {
            if (cars[b].ujeteKM>nejviceujeteKM.ujeteKM) {
                nejviceujeteKM = cars[b];
            }
        }
        System.out.println("Nejvíce Km ujelo: ");
        System.out.println(nejviceujeteKM.printinfo());
    }

    public void VypisZajimavosti() {
        System.out.println("počet aut: ");
        System.out.println(cars.length);
        System.out.println("Jméno vlastníka: ");
        System.out.println(owner);
        System.out.println("počet písmen jména: ");
        System.out.println(owner.length());
        System.out.println("první písmeno jména: ");
        System.out.println(owner.charAt(0));

        for (Car car : cars) {
            if (car.condition.equals("damaged") ) {
                System.out.println("Jedno z aut má stav damaged");
            }
        }
    }
}
