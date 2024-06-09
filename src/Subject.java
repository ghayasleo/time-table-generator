public class Subject {
    private final String name;
    private final int creditHours;

    Subject(String name, int creditHours) {
        this.name = name;
        this.creditHours = creditHours;
    }

    public String getName() {
        return name;
    }

    public int getCreditHours() {
        return creditHours;
    }
}
