import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CohortTest {
    Cohort cohort;
    Student student1;
    Student student2;

    @Before
    public void setUo() {
        student1 = new Student(9L, "Jeff");
        student2 = new Student(10L, "Bob");
        cohort = new Cohort();

        student1.addGrade(100);
        student1.addGrade(95);
        student1.addGrade(90);
        student2.addGrade(100);
        student2.addGrade(85);
        student2.addGrade(100);
    }

    @Test
    public void testAddStudent(){
        assertEquals(0, cohort.getStudents().size());
        cohort.addStudent(student1);
        assertEquals(1, cohort.getStudents().size());
        cohort.addStudent(student2);
        assertEquals(2, cohort.getStudents().size());
    }

    @Test
    public void testGetStudents() {
        cohort.addStudent(student1);
        cohort.addStudent(student2);
        assertEquals(student1, cohort.getStudents().get(0));
        assertEquals(student2, cohort.getStudents().get(1));
    }

    @Test
    public void testGetGradeAverage() {
        cohort.addStudent(student1);
        cohort.addStudent(student2);

        assertEquals(95, cohort.getCohortAverage(), 0);
    }
}