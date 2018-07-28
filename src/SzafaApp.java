public class SzafaApp {

    public static void main(String[] args) {

        Szafa szafa = new Szafa(40, 50, 100, 5, "Dąb");

        System.out.println(szafa.getGlebokosc());
        System.out.println(szafa.getMaterial());
    }
}
