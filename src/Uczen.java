import java.util.ArrayList;

public class Uczen {

    private String name;
    private String surname;
    private String schoolClass;
    private ArrayList<Integer> oceny = new ArrayList<Integer>(0);

    public Uczen(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Uczen(String name, String surname, String schoolClass){
        this.name = name;
        this.surname = surname;
        this.schoolClass = schoolClass;
    }

    public void setOceny(Integer oceny) {
        this.oceny.add(oceny);
    }

    public ArrayList<Integer> getOceny() {
        return oceny;
    }

    public String getName() {
        return name;
    }

    public String getSchoolClass() {
        return schoolClass;
    }

    public String getSurname() {
        return surname;
    }

    public void setSchoolClass(String schoolClass) {
        this.schoolClass = schoolClass;
    }

    public Integer najnizszaOcena(){

        int smallest = oceny.get(0);
        for(int x : oceny ){
            if (x < smallest) {
                smallest = x;
            }
        }
        return smallest;
    }

    public Integer najwyzszaOcena(){

        int highest = oceny.get(0);
        for(int x : oceny ){
            if (x > highest) {
                highest = x;
            }
        }
        return highest;
    }

    public Double sredniaOcen(){
        if (oceny.size() > 0) {
            Double srednia = 0.0;
            for (int x : oceny) {
                srednia += x;
            }
            return srednia / oceny.size();
        }else {
            return 0.0;
        }
    }

    public void ustawOceny(Integer[] oceny){
        for(Integer i:oceny){
            this.setOceny(i);
        }
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", schoolClass='" + schoolClass + '\'' +
                ", oceny=" + oceny +
                '}';
    }
}
