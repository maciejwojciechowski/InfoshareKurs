import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UczenApp {

    public static void main(String[] args) throws IOException {

        Uczen uczen1 = new Uczen("Maciej", "Wojciechowski");
        uczen1.setSchoolClass("Infoshare Java DevQA");

        Integer[] ocenyUcznia1 = wczytajOceny("inputplik.txt");

        uczen1.ustawOceny(ocenyUcznia1);

        System.out.println(uczen1.getOceny());

        System.out.println("Najnizsza ocena: " + uczen1.najnizszaOcena());
        System.out.println("Najwyzsza ocena: " + uczen1.najwyzszaOcena());
        System.out.println("Srednia ocen: " + uczen1.sredniaOcen());

        System.out.println(uczen1);
    }

    public static Integer[] wczytajOceny(String nazwaPliku) throws IOException {

        String mojPlik = new String(Files.readAllBytes(Paths.get(nazwaPliku)));
        String[] mojPlikTablica = mojPlik.split(",");

        Integer[] ocenyZPliku = new Integer[mojPlikTablica.length];

        for(int i = 0; i < mojPlikTablica.length; i++){
                ocenyZPliku[i] = Integer.parseInt(mojPlikTablica[i]);
        }
        return ocenyZPliku;
    }



}


