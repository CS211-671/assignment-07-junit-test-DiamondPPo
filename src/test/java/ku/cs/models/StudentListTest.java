package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    private StudentList studentList;

    @BeforeEach
    void setUp(){
        studentList = new StudentList();
    }

    @Test
    public void testAddNewStudentWithoutScore() {
        studentList.addNewStudent("001", "A");

        Student student = studentList.findStudentById("001");
        assertEquals("A", student.getName());
    }

    @Test
    public void testAddNewStudentWithScore() {
        studentList.addNewStudent("002", "B", 85.5);

        Student student = studentList.findStudentById("002");
        assertEquals("B", student.getName());
        assertEquals(85.5, student.getScore());
    }

    @Test
    public void testFindStudentByID(){
        studentList.addNewStudent("002.5", "BB");
        assertEquals("BB", studentList.findStudentById("002.5").getName());
    }

    @Test
    public void testGiveScoreToId() {
        studentList.addNewStudent("003", "C");

        studentList.giveScoreToId("003", 90.0);

        Student student = studentList.findStudentById("003");
        assertEquals(90.0, student.getScore());
    }

    @Test
    public void testViewGradeOfId() {
        studentList.addNewStudent("004", "D", 75.0);

        String grade = studentList.viewGradeOfId("004");
        assertEquals("B", grade);
    }

}