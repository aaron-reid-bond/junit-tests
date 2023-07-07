import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    public Student jimmy;
    public Student supper;

    @Before
    public void setUp(){
        jimmy = new Student(1, "Jimmy Neutron");
        jimmy.addGrade(65);
        jimmy.addGrade(75);
        jimmy.addGrade(85);
        jimmy.addGrade(95);
        supper = new Student(2, "Supper Man");
        supper.addGrade(45);
        supper.addGrade(55);
        supper.addGrade(65);
        supper.addGrade(75);
        supper.addGrade(85);
    }


    @Test
    public void testId(){
        assertEquals( 1, jimmy.getId());
        assertEquals( 2, supper.getId());
    }

    @Test
    public void testStudent(){
        assertEquals("Jimmy Neutron", jimmy.getName());
        assertEquals("Supper Man", supper.getName());
    }

    @Test
    public void testGrade(){
        assertEquals( 65, jimmy.getGrades(0));
        assertEquals( 45, supper.getGrades(0));
        assertEquals( 4 , jimmy.getGrades().size());
        assertEquals( 5 , supper.getGrades().size());
    }

    @Test
    public void testAverage(){
        assertEquals(80, jimmy.getGradeAverage(),0);
        assertEquals(65, supper.getGradeAverage(),0);
    }
}
