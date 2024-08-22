package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testAddScore(){
        Student s1 = new Student("6xxxxxxxxx", "A");
        s1.addScore(40);
        assertEquals(40, s1.getScore());
        s1.addScore(30);
        assertEquals(70, s1.getScore());
    }

    @Test
    void testCalculateGrade(){
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    void testChangeName(){
        Student s = new Student("6xxxxxxxxx", "test");
        s.changeName("5xxxxxxxxx");
        assertEquals("5xxxxxxxxx", s.getName());
    }

    @Test
    void testisID(){
        Student s = new Student("6xxxxxxxxx", "test");
        boolean actual = s.isId("6xxxxxxxxx");
        assertTrue(actual);
    }
}