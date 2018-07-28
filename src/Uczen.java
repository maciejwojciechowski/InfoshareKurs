public class Uczen {

    private String name;
    private String surname;
    private String schoolClass;
    private String oceny;

    public Uczen(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Uczen(String name, String surname, String schoolClass){
        this.name = name;
        this.surname = surname;
        this.schoolClass = schoolClass;
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

    public String getOceny() {
        return oceny;
    }

    public void setOceny(String oceny) {
        this.oceny = oceny;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", schoolClass='" + schoolClass + '\'' +
                ", oceny='" + oceny + '\'' +
                '}';
    }
}
