import java.util.ArrayList;

public class Class {
    private String program;
    private String group;
    private int semester;
    private ArrayList<Subject> subjects = new ArrayList<>();

    private final String[][] timeTable = new String[5][4];

    public Class(String program, String group, int semester) {
        this.program = program;
        this.group = group;
        this.semester = semester;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
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

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }
}
