import java.util.Scanner;

public class FunkcjaKwadratowa {

    public static void main(String[] args) {

        Double a;
        Double b;
        Double c;

        try {
            Scanner scanInput = new Scanner(System.in);
            System.out.println("Wpisz wartosc 'a'");
            a = Double.valueOf(scanInput.nextLine());
            System.out.println("Wpisz wartosc 'b'");
            b = Double.valueOf(scanInput.nextLine());
            System.out.println("Wpisz wartosc 'c'");
            c = Double.valueOf(scanInput.nextLine());

            //a do potegi b
            //Math.pow(a,b)

            //pierwiastek
            //Math.sqrt(a)

            //delta = b^2-4ac
            //x1 = -b+delta^0,5/2a
            //x2 = -b-delta^0,5/2a

            if (a != 0) {

                Double delta = Double.valueOf(Math.pow(b,2) - 4*a*c);
                System.out.println("Delta wynosi: " + delta);

                if (delta < 0) {
                    System.out.println("Delta jest ujemna, brak miejsc zerowych");
                } else if (delta == 0) {
                    double xzero = (b * -1) / (2 * a);
                    System.out.println("Funkcja ma jedno miejsce zerowe X0 = " + xzero);
                } else {
                    double xjeden = ((b * -1) + Math.sqrt(delta)) / (2 * a);
                    double xdwa = ((b * -1) - Math.sqrt(delta)) / (2 * a);

                    System.out.println("Funkcja ma dwa miejsca zerowe.\n" + "X1 = " + xjeden + "\n" + "X2 = " + xdwa);
                }
            }
            else {
                System.out.println("To jest funkcja liniowa.");
            }

        } catch (NumberFormatException e){
            System.out.println("Możesz podać tylko liczby!");
        }

    }
}
