import java.util.*;

public class Main {
    public static void main(String[] args) {
        TimeTableGenerator timeTableGenerator = new TimeTableGenerator();
        String[][][] timeTables = timeTableGenerator.generate();

        int idx = 0;
        int maxLetters = timeTableGenerator.getMaxLetters();

        for (String[][] classes : timeTables) {
            Class _class = timeTableGenerator.getClasses().get(idx);
            System.out.println(_class.getProgram() + " Semester " + _class.getSemester() + " Group " + _class.getGroup());
            for (String[] days : classes) {
                for (String teacher : days) {
                    StringBuilder letters = new StringBuilder(teacher == null ? "." : teacher);
                    while (letters.length() < maxLetters) {
                        letters.append(" ");
                    }
                    System.out.print(letters + "  ");
                }
                System.out.println();
            }
            idx++;
            System.out.println("----------------------------------------");
        }
    }
}