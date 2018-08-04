import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class PracaPliki {

    public static void main(String[] args) throws IOException{

        String mojPlik = new String(Files.readAllBytes(Paths.get("inputplik.txt")));
        System.out.println(mojPlik);

        String[] mojPlikTablica = mojPlik.split(",");
        String[] tempTablica = new String[mojPlikTablica.length];
        for(String x : mojPlikTablica){
         //   int index = Arrays.asList(mojPlikTablica).indexOf(x);
         //   tempTablica[index] = x;
            int counter = 0;
            for(String y : mojPlikTablica){
                if (x.equals(y)){
                    counter++;
                }

            }
            System.out.println("Elememnt " + x + " wystapil " + counter + " razy");

        }


    }
}
