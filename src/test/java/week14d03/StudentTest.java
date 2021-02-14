package week14d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void createStudentTest() {
        Student student = new Student("Abraham");
        assertEquals("Abraham", student.getNameOfStudent());
    }

    @Test
    void addNotesTest() {
        Student student = new Student("Liza");

        student.addGrade("math", 5);
        assertEquals(1, student.getStudentsGrad().size());

        student.addGrade("math", 4);
        assertEquals(1, student.getStudentsGrad().size());

        student.addGrade("biology", 4);
        assertEquals(2, student.getStudentsGrad().size());

        assertEquals(5, student.getStudentsGrad().get("math").get(0));
        assertEquals(4, student.getStudentsGrad().get("math").get(1));
        assertEquals(4, student.getStudentsGrad().get("biology").get(0));
    }
}