import java.util.Scanner;

public class Trojkat {

    public static void main(String[] args) {
        //TODO
        Scanner scanInput = new Scanner(System.in);
        System.out.println("Wpisz liczbe wierszy");
        Integer a = Integer.valueOf(scanInput.nextLine());

        Integer[] tablica = new Integer[a];
        for (int i = 1; i <= tablica.length; i++){
            int k = 1;
            while (k <= i) {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }


    }
}
