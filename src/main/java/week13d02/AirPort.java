package week13d02;

import collectionsautoboxing.IntegerOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AirPort {

    private List<Airways> jaratokLista = new ArrayList<>();

    // OLVASD BE A FILE TARTALMÁT
    public void readFromFile(String fileLocation) {

        try {
            BufferedReader br = Files.newBufferedReader(Path.of(fileLocation));

            String line;
            while ((line = br.readLine()) != null) {
                jaratokLista.add(makeAirwayFromLine(br));

            }

        } catch (IOException e) {
            throw new IllegalArgumentException("cant read file", e);
        }
    }


    private Airways makeAirwayFromLine(BufferedReader br) throws IOException {
        String[] jaratTomb = br.readLine().split(" ");
        String jaratSzama = jaratTomb[0];
        String irany = jaratTomb[1];
        String varos = jaratTomb[2];
        String[] idopontTomb = jaratTomb[3].split(":");
        LocalTime idopont = LocalTime.of(Integer.parseInt(idopontTomb[0]), Integer.parseInt(idopontTomb[1]));


        return new Airways(jaratSzama, irany, varos, idopont);
    }

    //Járatszám alapján adj vissz egy járatot
    public Airways getJarat(String jaratszam) {
        for (Airways jarat : jaratokLista) {
            if (jarat.getJaratId().equals(jaratszam)) {
                return jarat;
            }
        }
        throw new IllegalArgumentException("Nem találtam ilyen járatot");
    }

    // Induló vagy érkező járat van több?
    public String indulVagyErkezik() {
        int induloSum = 0;
        int erkezoSum = 0;
        for (Airways item : jaratokLista) {
            if (item.getIrany().equals("Arrival")) {
                erkezoSum++;
            } else {
                induloSum++;
            }
        }
        return (induloSum > erkezoSum) ? "Induló járatból van több" : "Érkező járatból van több";
    }

    // Bekér egy várost és azt, h induló v. érkező járat, és kilistázza a városhoz tarozó összes relevánsat

    public List<Airways> findByCity(String varos, String irany) {
        List<Airways> egyVarosJaratai = new ArrayList<>();
        for (Airways jarat : jaratokLista) {
            if (jarat.getIrany().equals(irany) && jarat.getVaros().equals(varos)) {
                egyVarosJaratai.add(jarat);
            }
        }
        return egyVarosJaratai;
    }

    public Airways legkorabbi() {

        Airways legkorabbanIndulo = jaratokLista.get(0);

        for (Airways jarat : jaratokLista) {
            if (jarat.getTime().isBefore(legkorabbanIndulo.getTime()) && jarat.getIrany().equals("Departure")) {
                legkorabbanIndulo = jarat;
            }
        }
        return legkorabbanIndulo;
    }

    public List<Airways> getJaratokLista() {
        return jaratokLista;
    }

    public static void main(String[] args) {
        AirPort airport = new AirPort();
        airport.readFromFile("cities.txt");
        System.out.println("A lista");
        System.out.println(airport.getJaratokLista());

        System.out.println("Egy járat id alapján");
        System.out.println(airport.getJarat("SW1667").toString());

        System.out.println("Miből van több");
        System.out.println(airport.indulVagyErkezik());

        System.out.println("Egy város egy irány");
        System.out.println(airport.findByCity("Zurich", "Departure"));
        System.out.println("Legkorábbi");
        System.out.println(airport.legkorabbi());

    }
}
