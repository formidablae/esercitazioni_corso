package esercizi_in_lezione.week9.day2.students_grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class School {
    private static School instance = null;
    private String name;
    private HashSet<Student> students;
    private HashSet<Subject> subjects;
    /*
    {
        "stud1": {
            "Mate": [6, 7, 8],
            "Fisica": [6, 7, 8]
        },
        "stud2": {
            "Letteratura": [6, 7, 8],
            "Chimica": [6, 7, 8]
        }
    }
     */

    private HashMap<String, HashMap<String, ArrayList<Integer>>> grades;

    private School(String name) {
        this.name = name;
        this.students = new HashSet<>();
        this.grades = new HashMap<>();
        this.subjects = new HashSet<>();
    }

    public static School getInstance() {
        if (instance == null) {
            instance = new School("La mia scuola");
        }
        return instance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("School: " + name + "\n");
        sb.append("Students: \n");
        for (Student s : students) {
            sb.append(s.toString() + "\n");
        }
        sb.append("Subjects: \n");
        for (Subject s : subjects) {
            sb.append(s.toString() + "\n");
        }
        sb.append("Grades: \n");
        for (String id : grades.keySet()) {
            sb.append("    " + getStudentById(id).toString() + "\n");
            for (String subject : grades.get(id).keySet()) {
                sb.append("        " + subject + ": " + grades.get(id).get(subject) + "\n");
            }
        }
        return sb.toString();
    }

    public void addStudent(String name, String surname) {
        Student s = new Student(name, surname);
        students.add(s);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addGrade(String idStudente, String subject, int grade) {
        if (containsStudent(idStudente)) {
            if (containsSubject(subject)) {
                if (grades.containsKey(idStudente)) {
                    if (grades.get(idStudente).containsKey(subject)) {
                        grades.get(idStudente).get(subject).add(grade);
                    } else {
                        grades.get(idStudente).put(subject, new ArrayList<>());
                        grades.get(idStudente).get(subject).add(grade);
                    }
                } else {
                    grades.put(idStudente, new HashMap<>());
                    grades.get(idStudente).put(subject, new ArrayList<>());
                    grades.get(idStudente).get(subject).add(grade);
                }
            } else {
                Subject s = new Subject(subject);
                subjects.add(s);
                if (grades.containsKey(idStudente)) {
                    grades.get(idStudente).put(subject, new ArrayList<>());
                    grades.get(idStudente).get(subject).add(grade);
                } else {
                    grades.put(idStudente, new HashMap<>());
                    grades.get(idStudente).put(subject, new ArrayList<>());
                    grades.get(idStudente).get(subject).add(grade);
                }
            }
        } else {
            System.out.println("Studente non trovato");
        }
    }

    public boolean containsStudent(String idStudente) {
        for (Student s : students) {
            if (s.getId().equals(idStudente)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsStudent(Student student) {
        return containsStudent(student.getId());
    }


    public boolean containsSubject(String subject) {
        for (Subject s : subjects) {
            if (s.getName().equals(subject)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsSubject(Subject subject) {
        return containsSubject(subject.getName());
    }

    public void addSubject(String subjectName) {
        Subject s = new Subject(subjectName);
        subjects.add(s);
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public HashSet<Student> getStudents() {
        return students;
    }

    public HashSet<String> getStudentIds() {
        HashSet<String> ids = new HashSet<>();
        for (Student s : students) {
            ids.add(s.getId());
        }
        return ids;
    }

    public HashSet<String> getSubjectNames() {
        HashSet<String> subjects = new HashSet<>();
        for (Subject s : this.subjects) {
            subjects.add(s.getName());
        }
        return subjects;
    }

    public HashSet<Subject> getSubjects() {
        return subjects;
    }

    public Student getStudentById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    public void clearStudents() {
        students.clear();
        grades.clear();
    }

    public void clearSubjects() {
        subjects.clear();
        grades.clear();
    }

    public void clearSchool() {
        students.clear();
        subjects.clear();
        grades.clear();
    }

    public void clearGrades() {
        grades.clear();
    }

    public int getTotalGradesCount() {
        int count = 0;
        for (String studentId : grades.keySet()) {
            for (String subject : grades.get(studentId).keySet()) {
                count += grades.get(studentId).get(subject).size();
            }
        }
        return count;
    }

    public HashMap<String, ArrayList<Integer>> getGradesByStudent(String studentId) {
        return grades.get(studentId);
    }

    public HashMap<String, ArrayList<Integer>> getGradesByStudent(Student student) {
        return grades.get(student.getId());
    }

    public ArrayList<Integer> getGradesByStudentAndSubject(Student student, String subjectStr) {
        return grades.get(student.getId()).get(subjectStr);
    }

    public ArrayList<Integer> getGradesByStudentAndSubject(String studentId, String subjectStr) {
        return grades.get(studentId).get(subjectStr);
    }

    public ArrayList<Integer> getGradesByStudentAndSubject(String studentId, Subject subject) {
        return grades.get(studentId).get(subject.getName());
    }

    public ArrayList<Integer> getGradesByStudentAndSubject(Student student, Subject subject) {
        return grades.get(student.getId()).get(subject.getName());
    }
}
