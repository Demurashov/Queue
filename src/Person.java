public class Person {
    private String name;
    private int tikets;

    public Person(String name, int tikets) {
        this.name = name;
        this.tikets = tikets;
    }

    public String getName() {
        return name;
    }

    public int getTikets() {
        return tikets;
    }

    public void composter() {
        if (tikets > 0) {
            tikets -= 1;
        }
    }
}
