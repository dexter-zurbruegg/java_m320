public class Student extends Person {
    private int gradeLevel;

    public Student(String name, String birthday, String address, int gradeLevel) {
        super(name, birthday, address);
        this.gradeLevel = gradeLevel;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}
