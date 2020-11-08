package arraylist;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {

    List<String> konyvek = new ArrayList<>();

    public void addKonyv(String cim) {
        konyvek.add(cim);
    }

    public List<String> getCimek (){
        return konyvek;
    }

    public List<String> elejeEgyezik() {

    List<String> talalatKonyv = new ArrayList<>();

        System.out.println("Címrészlet?");
        Scanner scanner = new Scanner(System.in);

        String keresettCimreszlet = scanner.nextLine();

        for(String konyv:konyvek)
        {
            if (konyv.startsWith(keresettCimreszlet)) {
                talalatKonyv.add(konyv);
            }
        }


    return talalatKonyv;

    }

    // MAIN

    public static void main(String[] args) {
        Books konyvlista = new Books();

        konyvlista.addKonyv("Első könyv címe");
        konyvlista.addKonyv("Második könyv címe");
        konyvlista.addKonyv("Harmadik könyv címe");
        konyvlista.addKonyv("Első ez is, csak másképp");

        System.out.println(konyvlista.getCimek());

        System.out.println(konyvlista.elejeEgyezik());
    }



}
