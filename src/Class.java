import java.util.ArrayList;

public class Class {
    private final String program;
    private final String group;
    private final int semester;
    private final ArrayList<Subject> subjects; // not used

    private final String[][] timeTable = new String[5][4];

    public Class(String program, String group, int semester) {
        this.program = program;
        this.group = group;
        this.semester = semester;
        this.subjects = new ArrayList<>();
    }

    public String getProgram() {
        return program;
    }

    public String getGroup() {
        return group;
    }

    public String[][] getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(int i, int j, String teacher) {
        this.timeTable[i][j] = teacher;
    }

    public int getSemester() {
        return semester;
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }
}
