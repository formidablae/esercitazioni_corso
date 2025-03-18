package esercizi_in_lezione.week9.day2.students_grades;

public class SchoolRunner {
    public static void main(String[] args) {
        School school = School.getInstance();

        school.addStudent("Mario", "Rossi");
        school.addStudent("Luigi", "Bianchi");
        school.addStudent("Giovanna", "Verdi");
        school.addStudent("Anna", "Neri");
        school.addStudent("Carlo", "Gialli");
        school.addStudent("Maria", "Arancioni");

        school.addSubject("Matematica");
        school.addSubject("Fisica");
        school.addSubject("Chimica");
        school.addSubject("Inglese");
        school.addSubject("Italiano");
        school.addSubject("Storia");
        school.addSubject("Geografia");
        school.addSubject("Filosofia");
        school.addSubject("Scienze");

        // randomly assign grades to students
        for (String studentId : school.getStudentIds()) {
            for (String subjectName : school.getSubjectNames()) {
                for (int i = 0; i < 10; i++) {
                    int grade = (int) (Math.random() * 10) + 1;
                    school.addGrade(studentId, subjectName, grade);
                }
            }
        }

        System.out.println(school);

        School school2 = School.getInstance();
        System.out.println(school2);
        System.out.println(school == school2);
    }
}
