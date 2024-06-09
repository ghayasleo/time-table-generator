import java.util.ArrayList;
import java.util.List;

public class Combo {
    List<Teacher> teachers = new ArrayList<>();
    List<Class> classes = new ArrayList<>();

    Combo() {
        Subject english = new Subject("English", 3);

        Subject pfTheory = new Subject("Programming Theory", 3);
        Subject pfLab = new Subject("Programming Lab", 3);
        Subject calculus = new Subject("Calculus", 3);
        Subject physics = new Subject("Physics", 3);
        Subject ictTheory = new Subject("ICT Theory", 2);
        Subject ictLab = new Subject("ICT Lab", 1);
        Subject pakStudies = new Subject("Pakistan Studies", 2);

        Subject oopTheory = new Subject("OOP Theory", 3);
        Subject oopLab = new Subject("OOP Lab", 1);
        Subject dsTheory = new Subject("Data Science Theory", 2);
        Subject dsLab = new Subject("Data Science Lab", 1);
        Subject discrete = new Subject("Discrete Structure", 3);
        Subject linearAlgebra = new Subject("Linear Algebra", 3);
        Subject islamiat = new Subject("Islamiat", 2);

        Class dataScience2A = new Class("Data Science", "A", 2);
        Class dataScience2B = new Class("Data Science", "B", 2);
        Class dataScience1A = new Class("Data Science", "A", 1);
        Class dataScience1B = new Class("Data Science", "B", 1);
        this.classes.add(dataScience2A);
        this.classes.add(dataScience2B);
        this.classes.add(dataScience1B);
        this.classes.add(dataScience1A);

        this.teachers.add(new Teacher("Sikandar Tangi"));
        this.teachers.get(getIdx()).addCourse(pakStudies, dataScience1A);
        this.teachers.get(getIdx()).addCourse(pakStudies, dataScience2A);

        this.teachers.add(new Teacher("Nazia Omar"));
        this.teachers.get(getIdx()).addCourse(english, dataScience1A);
        this.teachers.get(getIdx()).addCourse(english, dataScience2A);
        this.teachers.get(getIdx()).addCourse(english, dataScience1B);
        this.teachers.get(getIdx()).addCourse(english, dataScience2B);

        this.teachers.add(new Teacher("Muhammad Ali"));
        this.teachers.get(getIdx()).addCourse(ictTheory, dataScience1A);
        this.teachers.get(getIdx()).addCourse(ictTheory, dataScience1B);

        this.teachers.add(new Teacher("Kaiser Khan"));
        this.teachers.get(getIdx()).addCourse(ictLab, dataScience1A);
        this.teachers.get(getIdx()).addCourse(ictLab, dataScience1B);

        this.teachers.add(new Teacher("Muhammad Shahzad"));
        this.teachers.get(getIdx()).addCourse(islamiat, dataScience2A);
        this.teachers.get(getIdx()).addCourse(islamiat, dataScience2B);

        this.teachers.add(new Teacher("Imran Khan"));
        this.teachers.get(getIdx()).addCourse(calculus, dataScience1A);
        this.teachers.get(getIdx()).addCourse(calculus, dataScience1B);

        this.teachers.add(new Teacher("Ali Abbas"));
        this.teachers.get(getIdx()).addCourse(physics, dataScience1A);
        this.teachers.get(getIdx()).addCourse(physics, dataScience1B);

        this.teachers.add(new Teacher("Shahzad Khan"));
        this.teachers.get(getIdx()).addCourse(pfTheory, dataScience2B);
        this.teachers.get(getIdx()).addCourse(oopTheory, dataScience2A);

        this.teachers.add(new Teacher("Inam Ul Haq"));
        this.teachers.get(getIdx()).addCourse(oopLab, dataScience2A);
        this.teachers.get(getIdx()).addCourse(oopLab, dataScience2B);
        this.teachers.get(getIdx()).addCourse(pfLab, dataScience1A);
        this.teachers.get(getIdx()).addCourse(pfLab, dataScience1B);

        this.teachers.add(new Teacher("Bushra Tahir"));
        this.teachers.get(getIdx()).addCourse(dsTheory, dataScience2A);
        this.teachers.get(getIdx()).addCourse(dsTheory, dataScience2B);

        this.teachers.add(new Teacher("Amir Khan"));
        this.teachers.get(getIdx()).addCourse(dsLab, dataScience2A);
        this.teachers.get(getIdx()).addCourse(dsLab, dataScience2B);

        this.teachers.add(new Teacher("Nawaz Khan"));
        this.teachers.get(getIdx()).addCourse(discrete, dataScience2A);
        this.teachers.get(getIdx()).addCourse(discrete, dataScience2B);

        this.teachers.add(new Teacher("Afsheen Khalid"));
        this.teachers.get(getIdx()).addCourse(linearAlgebra, dataScience2A);
        this.teachers.get(getIdx()).addCourse(linearAlgebra, dataScience2B);
    }

    private int getIdx() {
        return this.teachers.size() - 1;
    }

    public List<Teacher> getTeachers() {
        return this.teachers;
    }

    public List<Class> getClasses() {
        return this.classes;
    }
}
