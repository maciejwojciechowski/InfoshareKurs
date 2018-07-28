import java.util.Scanner;

public class Zadanka2 {

    public static void main(String[] args) {

        //popros o date urodzin i podaj pore roku

        Scanner scanInput = new Scanner(System.in);
        System.out.println("Podaj miesiac urodzin: ");
        String a = scanInput.nextLine();

        jakaPora(a);
    }

    public static void jakaPora(String miesiac) {

        switch (miesiac) {
            case "1":
            case "2":
            case "12":
                System.out.println("Zima");
                break;
            case "3":
            case "4":
            case "5":
                System.out.println("Wiosna");
                break;
            case "6":
            case "7":
            case "8":
                System.out.println("Lato");
                break;
            case "9":
            case "10":
            case "11":
                System.out.println("Jesień");
                break;
            default:
                System.out.println("nie wiem");
                break;
        }
    }

}