import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TimeTableGenerator {
    Combo combo;
    List<Teacher> teachers;
    List<Class> classes;
    String[][][] timeTables;
    int maxLetters = 0;

    TimeTableGenerator() {
        combo = new Combo();
        teachers = combo.getTeachers();
        classes = combo.getClasses();
        timeTables = new String[classes.size()][5][4];
    }

    public String[][][] generate() {
        int iteration = 0;
        int idx = 0;
        for (Class _class : classes) {
            for (Teacher teacher : teachers) {
                for (Map<String, Object> obj : teacher.getCourses()) {
                    Object __class = obj.get("class");
                    Object subject = obj.get("subject");
                    if (Objects.equals(__class.toString(), _class.toString())) {
                        int i = 0;
                        int classesAdded = 0;
                        boolean flag = false;
                        for (String[] days : _class.getTimeTable()) {
                            int j = 0;
                            for (String period : days) {
                                iteration++;
                                if (!flag && (period == null && teacher.getTimeTable()[i][j] == null)) {
                                    if (subject instanceof Subject) {
                                        String name = ((Subject) subject).getName();
                                        int creditHour = ((Subject) subject).getCreditHours();
                                        int maxClasses;
                                        if (creditHour == 1 || creditHour == 3) {
                                            maxClasses = 2;
                                        } else {
                                            maxClasses = 1;
                                        }
                                        boolean exists = Arrays.toString(days).contains(teacher.getName());
                                        if (!exists && classesAdded < maxClasses) {
                                            if (creditHour != 2 || j != 0) {
                                                classesAdded++;
                                                teacher.setTimeTable(i, j, name);
                                                _class.setTimeTable(i, j, teacher.getName());
                                                timeTables[idx][i][j] = teacher.getName();
                                                maxLetters = Math.max(maxLetters, teacher.getName().length());
                                            }

                                            if (classesAdded == maxClasses) {
                                                flag = true;
                                            }
                                        }
                                    }
                                }
                                j++;
                            }
                            i++;
                        }
                    }
                }
            }
            idx++;
        }
        System.out.println("Iteration " + iteration);
        return timeTables;
    }

    public int getMaxLetters() {
        return maxLetters;
    }

    public List<Class> getClasses() {
        return classes;
    }
}
