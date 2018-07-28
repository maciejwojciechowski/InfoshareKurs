import java.util.Arrays;

public class Zadanka {

    public static void main(String[] args) {

      //wypisz liczby nieparzyste od 0 - 100

      for(int i = 0; i <=100; i++){
          if(i%2 != 0){
              System.out.print(i + " ");
          }

      }
        System.out.println();
      //odwroc string "java dev qa"

      String orginalnyString = "java dev qa";
      String[] tempTablica = orginalnyString.split("");
      String[] nowaTablica = new String[tempTablica.length];

      for(int i = 0; i < tempTablica.length; i++){
            nowaTablica[tempTablica.length - i - 1] = tempTablica[i];
      }

      String nowyText = Arrays.toString(nowaTablica);
        nowyText = nowyText.substring(1, nowyText.length()-1).replace(",", "");
        System.out.println(nowyText);


      //kwadrat 5x5

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print('#');
            }
            System.out.println();
        }


        //234 - 1234
        int i = 234;

        while(i<=1234){
            if(i%2 == 0){
                System.out.println(i);
            }

            i++;
        }

        //switch
        //ile jest samoglosek??



    }
}
