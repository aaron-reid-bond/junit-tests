import java.util.ArrayList;

public class Student {
    private Long id;
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int i, String x) {
        this.id = (long) i;
        this.name = x;
    }


    // returns the student's id
    public long getId(){return this.id;}

    // returns the student's name
    public String getName(){return this.name;}

    // adds the given grade to the grades list
    public void addGrade(int grade){grades.add(grade);}

    // returns the list of grades
    public ArrayList<Integer> getGrades(){return this.grades;}

    public int getGrades(int i){return this.grades.get(i);}

    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        for (int grade : grades){
            total += grade;
        }
        return total / grades.size();
    }


}
