import java.util.Arrays;

public class Tablice {

    public static void main(String[] args) {

        String[] mojaTablica = new String[10];

        for(int i = 0; i< mojaTablica.length; i++){
            mojaTablica[i] = "Imie" + i;
        }

        System.out.println(Arrays.toString(mojaTablica));

        String temp = mojaTablica[7];
        mojaTablica[7] = mojaTablica[3];
        mojaTablica[3] = temp;

        System.out.println(Arrays.toString(mojaTablica));



    }
}
