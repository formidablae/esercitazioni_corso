package esercizi_in_lezione.week9.day2.students_grades;

import java.util.UUID;

public class Student {
    private String name;
    private String surname;
    private String id;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Student) {
            Student other = (Student) obj;
            return this.id.equals(other.id);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", surname=" + surname + ", id=" + id + "]";
    }
}
