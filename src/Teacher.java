import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teacher {
    private String name;
    private final List<Map<String, Object>> courses = new ArrayList<>();

    private final String[][] timeTable = new String[5][4];

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCourse(Subject subject, Class _class) {
        Map<String, Object> newCourse = new HashMap<>();
        newCourse.put("subject", subject);
        newCourse.put("class", _class);
        _class.addSubject(subject);
        this.courses.add(newCourse);
    }

    public List<Map<String, Object>> getCourses() {
        return courses;
    }

    public String[][] getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(int i, int j, String _class) {
        this.timeTable[i][j] = _class;
    }
}
