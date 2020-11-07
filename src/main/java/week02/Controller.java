package week02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    List<MeetingRoom> listRooms = new ArrayList<>();
    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.readOffice(); //mennyi iroda legyen? - és be is kéne pakolja az Office osztályból létrehozott office példányba. De hogy?
        controller.printMenu(); // A PRINT MENÜ METÓDUS
        controller.runMenu(); // bekéri a választást



        ///// Kiírnám a listát


    }

    public void printMenu() {
        System.out.println(("MENÜ"));
        System.out.println((""));
        System.out.println(("1. Tárgyalók sorrendben"));
        System.out.println(("2. Tárgyalók fordított sorrendben"));
        System.out.println(("3. Minden második tárgyaló"));
        System.out.println(("4. Területek"));
        System.out.println(("5. Keresés pontos név alapján"));
        System.out.println(("6. Keresés névrészlet alapján"));
        System.out.println(("7. Keresés terület alapján"));




    }

    public void runMenu() {
        System.out.println("Válassz!");
        int menupont = scanner.nextInt();
        scanner.nextLine();

        if(menupont == 1) {
        System.out.println("Ezt választottad: " + menupont);

        printNames();

        }
        else if (menupont == 2 ){

            printNamesReverse();
        }

        else if (menupont == 3 ){

            evenNames();
        }


        else if (menupont == 4 ) {
            printAreas();
        }

        else if (menupont == 5) {
            printFullNameSearch();
        }
        else if (menupont == 6) {
            printNameContainSearch();;
        }

        else if (menupont == 7) {

            printAreasLargerThan();

        }


       }

       public void readOffice() {

        Office office = new Office();

          System.out.println("Termek száma:");

           Scanner scanner = new Scanner(System.in);

           int termekSzama = scanner.nextInt();


           for (int i = 0; i < termekSzama; i++) {
               scanner.nextLine(); // az előző  nextint miatt az entert öli meg

               System.out.println("Az " + (i + 1) + ". terem neve:");
               String nev = scanner.nextLine();

               System.out.println(nev);
               System.out.println("Az " + (i + 1) + ". terem hossza:");

               int szelesseg = scanner.nextInt();

               System.out.println("Az " + (i + 1) + ". terem szélessége:");
               int hossz = scanner.nextInt();

               MeetingRoom meetingRoom = new MeetingRoom(nev, szelesseg, hossz);

               listRooms.add(meetingRoom);

           }


       }

       //1. menü NEVEK
    public void printNames() {
        for( MeetingRoom item:listRooms) {
            System.out.println(item.getName());
        }
    }

    //2. menü NEVEK fordított sorrend
    public void printNamesReverse() {
        for (int i = listRooms.size(); i>0; i--) {
            System.out.println(listRooms.get(i-1).getName());
        }
    }
    // 3. menü PÁROS termek
    public void evenNames() {
        for(int i=0; i < listRooms.size(); i++) {
            if (i % 2 !=0) {
                System.out.println(listRooms.get(i).getName());
            }

        }
    }

    // 4. menü TERÜLET -> terem neve és területe
    public void printAreas() {
        for(int i=0; i < listRooms.size(); i++) {
              System.out.println("Név: " + listRooms.get(i).getName() + " - Terület: " + listRooms.get(i).getArea(listRooms.get(i).getLength(), listRooms.get(i).getWidth()) + "nm");
            }
    }

    // 5. menü KERESÉS pontos név alapján

    public void printFullNameSearch() {
        System.out.println("A terem pontos neve: ");
        String keresettTeremNeveFull = scanner.nextLine();

        for (int i = 0; i < listRooms.size(); i++) {
            String teremNeve = listRooms.get(i).getName();

             if (teremNeve.equals(keresettTeremNeveFull)) {

                System.out.println(listRooms.get(i).getName() + " " + listRooms.get(i).getArea(listRooms.get(i).getLength(), listRooms.get(i).getWidth()) + " nm");

            }


            }
        }





    // 6. menü KERESÉS névtöredék alapján

    public void printNameContainSearch() {
        System.out.println("A terem nevének részlete:");
        String keresettNev = scanner.nextLine();

        for (int i  = 0; i < listRooms.size() ; i++) {
            String teremNeve = listRooms.get(i).getName();

            if (teremNeve.contains(keresettNev))
            {
                System.out.println(listRooms.get(i).getName());
            }

        }


        }


    // 7. menü TERÜLETEK -> terület >= elvárt terület
    public void printAreasLargerThan() {

        System.out.println("Add meg a minimális méretet:");

        int elvartMeret = scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i < listRooms.size(); i++) {

            int meret = listRooms.get(i).getArea(listRooms.get(i).getLength(), listRooms.get(i).getWidth());

            if (meret >= elvartMeret) {
                System.out.println(listRooms.get(i).getName() + " " + meret);
            }
        }
    }

}
