package esercizi_in_lezione.week9.day2.students_grades;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void testAddStudentStr() {
        // GIVEN: a school
        School school = School.getInstance();
        assertEquals(0, school.getStudents().size());

        // WHEN: I add a student
        String stName = "Mario";
        String stSurname = "Rossi";
        school.addStudent(stName, stSurname);

        // THEN: the student is added
        assertEquals(1, school.getStudents().size());
        Student student = (Student) school.getStudents().toArray()[0];
        assertEquals(stName, student.getName());
        assertEquals(stSurname, student.getSurname());

        // cleanup
        school.clearStudents();
    }

    @Test
    void testAddStudentStu() {
        // GIVEN: a school
        School school = School.getInstance();
        assertEquals(0, school.getStudents().size());

        // WHEN: I add a student
        Student student = new Student("Mario", "Rossi");
        school.addStudent(student);

        // THEN: the student is added
        assertEquals(1, school.getStudents().size());
        Student studentActual = (Student) school.getStudents().toArray()[0];
        assertEquals(student.getName(), studentActual.getName());
        assertEquals(student.getSurname(), studentActual.getSurname());
        assertEquals(student.getId(), studentActual.getId());

        // cleanup
        school.clearStudents();
    }

    @Test
    void testAddGrade() {
        // GIVEN: a school, a student and a subject in that school
        School school = School.getInstance();
        Student student = new Student("Mario", "Rossi");
        String subject = "Matematica";
        school.addStudent(student);
        school.addSubject(subject);
        assertEquals(0, school.getTotalGradesCount());

        // WHEN: I add a grade
        int grade = 7;
        school.addGrade(student.getId(), subject, grade);

        // THEN: the grade is added
        assertEquals(1, school.getTotalGradesCount());
        assertEquals(1, school.getGradesByStudentAndSubject(student, subject).size());
        assertEquals(grade, school.getGradesByStudentAndSubject(student, subject).get(0));

        // cleanup
        school.clearSchool();
    }

    @Test
    void testContainsStudentStu() {
        // GIVEN: a school with a student
        School school = School.getInstance();
        assertEquals(0, school.getStudents().size());
        Student student = new Student("Mario", "Rossi");
        school.addStudent(student);

        // WHEN: I check if the student is in the school
        boolean result = school.containsStudent(student);

        // THEN: the result is true
        assertTrue(result);

        // cleanup
        school.clearSchool();
    }

    @Test
    void testContainsStudentStuNeg() {
        // GIVEN: a school and a student not in the school
        School school = School.getInstance();
        assertEquals(0, school.getStudents().size());
        Student student2 = new Student("Luca", "Bianchi");

        // WHEN: I check if the student 2 is not in the school
        boolean result = school.containsStudent(student2);

        // THEN: the result is false
        assertFalse(result);

        // cleanup
        school.clearSchool();
    }

    @Test
    void testContainsStudentStr() {
        // GIVEN: a school with a student
        School school = School.getInstance();
        assertEquals(0, school.getStudents().size());
        Student student = new Student("Mario", "Rossi");
        school.addStudent(student);

        // WHEN: I check by id if the student is in the school
        boolean result = school.containsStudent(student.getId());

        // THEN: the result is true
        assertTrue(result);

        // cleanup
        school.clearSchool();
    }

    @Test
    void testContainsStudentStrNeg() {
        // GIVEN: a school and a student not in the school
        School school = School.getInstance();
        assertEquals(0, school.getStudents().size());
        Student student2 = new Student("Luca", "Bianchi");

        // WHEN: I check by id if the student 2 is not in the school
        boolean result = school.containsStudent(student2.getId());

        // THEN: the result is false
        assertFalse(result);

        // cleanup
        school.clearSchool();
    }

    @Test
    void testContainsSubjectStr() {
        // GIVEN: a school with a subject
        School school = School.getInstance();
        assertEquals(0, school.getSubjects().size());
        String subjectStr = "Matematica";
        school.addSubject(subjectStr);

        // WHEN: I check if the subject is in the school
        boolean result = school.containsSubject(subjectStr);

        // THEN: the result is true
        assertTrue(result);

        // cleanup
        school.clearSchool();
    }
    @Test
    void testContainsSubjectStrNeg() {
        // GIVEN: a school and a subject not in the school
        School school = School.getInstance();
        assertEquals(0, school.getSubjects().size());
        String subjectStr = "Matematica";

        // WHEN: I check if the subject is in the school
        boolean result = school.containsSubject(subjectStr);

        // THEN: the result is false
        assertFalse(result);

        // cleanup
        school.clearSchool();
    }
    @Test
    void testContainsSubjectSub() {
        // GIVEN: a school with a subject
        School school = School.getInstance();
        assertEquals(0, school.getSubjects().size());
        Subject subject = new Subject("Matematica");
        school.addSubject(subject);

        // WHEN: I check if the subject is in the school
        boolean result = school.containsSubject(subject);

        // THEN: the result is true
        assertTrue(result);

        // cleanup
        school.clearSchool();
    }
    @Test
    void testContainsSubjectSubNeg() {
        // GIVEN: a school and a subject not in the school
        School school = School.getInstance();
        assertEquals(0, school.getSubjects().size());
        Subject subject = new Subject("Matematica");

        // WHEN: I check if the subject is in the school
        boolean result = school.containsSubject(subject);

        // THEN: the result is false
        assertFalse(result);

        // cleanup
        school.clearSchool();
    }

    @Test
    void testAddSubjectStr() {
        // GIVEN: a school and a subject
        School school = School.getInstance();
        String subjectStr = "Matematica";
        Subject subject = new Subject(subjectStr);

        // WHEN: I add the subject
        school.addSubject(subjectStr);

        // THEN: the subject is there
        assertEquals(1, school.getSubjects().size());
        Subject subjectActual = (Subject) school.getSubjects().toArray()[0];
        assertEquals(subject.getName(), subjectActual.getName());

        // cleanup
        school.clearSchool();
    }

    @Test
    void testAddSubjectSub() {
        // GIVEN: a school and a subject
        School school = School.getInstance();
        Subject subject = new Subject("Matematica");

        // WHEN: I add the subject
        school.addSubject(subject);

        // THEN: the subject is there
        assertEquals(1, school.getSubjects().size());
        Subject subjectActual = (Subject) school.getSubjects().toArray()[0];
        assertEquals(subject.getName(), subjectActual.getName());

        // cleanup
        school.clearSchool();
    }

    @Test
    void testGetStudentIds() {
        // GIVEN: a school and some students with their ids
        School school = School.getInstance();
        Student student1 = new Student("Mario", "Rossi");
        Student student2 = new Student("Luca", "Bianchi");
        school.addStudent(student1);
        school.addStudent(student2);
        HashSet<String> ids = new HashSet<>();
        ids.add(student1.getId());
        ids.add(student2.getId());

        // WHEN: I get the ids of the students
        HashSet<String> idsActual = school.getStudentIds();

        // THEN: the ids are the same
        assertEquals(ids, idsActual);

        // cleanup
        school.clearSchool();
    }

    @Test
    void testGetSubjectNames() {
        // GIVEN: a school and some subjects with their names
        School school = School.getInstance();
        String subject1 = "Matematica";
        String subject2 = "Fisica";
        school.addSubject(subject1);
        school.addSubject(subject2);
        HashSet<String> subjects = new HashSet<>();
        subjects.add(subject1);
        subjects.add(subject2);

        // WHEN: I get the names of the subjects
        HashSet<String> subjectsActual = school.getSubjectNames();

        // THEN: the names are the same
        assertEquals(subjects, subjectsActual);

        // cleanup
        school.clearSchool();
    }

    @Test
    void testGetStudentById() {
        // GIVEN: a school and a student
        School school = School.getInstance();
        Student student = new Student("Mario", "Rossi");
        school.addStudent(student);

        // WHEN: I get the student by id
        Student studentActual = school.getStudentById(student.getId());

        // THEN: the student is the same
        assertEquals(student, studentActual);

        // cleanup
        school.clearSchool();
    }
}