package elektroshop;
import autosaloon.Car;

import java.util.Scanner;
public class Items {
    static Scanner sc = new Scanner(System.in);
    private Fridge[] items;


    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu ledniček. A ty prida do pole items.
     * @param count - pozadovany pocet lednicek
     */
    public void addItems(int count) {
        items = new Fridge[count];
        for (int i=0; i<count; i++){
            System.out.println("Zadejte rok Vyroby:");
            int rokVyroby = sc.nextInt();
            sc.nextLine();

            System.out.println("Zadejte miru spotreby: (A-G)");
            Type mira = Type.valueOf(sc.nextLine());
            items[i] = new Fridge(rokVyroby, mira);
        }

    }


    /**
     * Tato metoda vypise informace o lednickach. Na prvnim rádku bude text "-----INFO O LEDNICKACH----- ",
     * na dalsich radkach bude vzdy rok vyroby lednick, dvojtecka a popis spotreby. (Vyuzijte metodu printInfo() tridy Fridge.)
     * Na poslednim radku bude text "-----".
     */
    public void printInfo(){
        Fridge FRIDGE = items[0];
        System.out.println("-----INFO O LEDNICKACH-----");
        for (int i =0;i< items.length;i++) {
            FRIDGE = items[i];
            System.out.println(FRIDGE.PrintInfo());
        }
        System.out.println("-----");
    }

    public void ItemsWithMiraA() {
        for (int i=0;i< items.length;i++) {
            if (items[i].getMira()==Type.A) {
                System.out.println(items[i].PrintInfo());
            }
        }
    }

    public void TotalItems() {
        System.out.println("Total number of items: "+items.length);
    }

    public void Zajimavosti() {


                int CountA =0;
                int CountB =0;
                int CountC =0;
                int CountD =0;
                int CountE =0;
                int CountF =0;
                int CountG =0;
                for (Fridge item : items) {
                    switch(item.getMira()) {
                        case A:
                            CountA++;
                            break;
                        case B :
                            CountB++;
                            break;
                        case C :
                            CountC++;
                            break;
                        case D :
                            CountD++;
                            break;
                        case E :
                            CountE++;
                            break;
                        case F :
                            CountF++;
                            break;
                        case G :
                            CountG++;
                            break;
            }
        }
        System.out.println("Počet energií A: "+CountA);
        System.out.println("Počet energií B: "+CountB);
        System.out.println("Počet energií C: "+CountC);
        System.out.println("Počet energií D: "+CountD);
        System.out.println("Počet energií E: "+CountE);
        System.out.println("Počet energií F: "+CountF);
        System.out.println("Počet energií G: "+CountG);


    }


}