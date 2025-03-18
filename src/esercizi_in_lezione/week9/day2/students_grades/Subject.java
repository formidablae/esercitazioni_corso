package esercizi_in_lezione.week9.day2.students_grades;

public class Subject {
    private String name;

    @Override
    public String toString() {
        return "Subject [name=" + name + "]";
    }

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
