public class Subject {
    private String name;
    private int creditHours;

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

    // Unused functions

    public void setName(String name) {
        this.name = name;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
}
