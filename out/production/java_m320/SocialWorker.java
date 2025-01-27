public class SocialWorker extends Person {
    private String areaOfFocus;
    private String[] students;

    public SocialWorker(String name, String birthday, String address, String areaOfFocus, String[] students) {
        super(name, birthday, address);
        this.areaOfFocus = areaOfFocus;
        this.students = students;
    }

    public String getAreaOfFocus() {
        return areaOfFocus;
    }

    public void setAreaOfFocus(String areaOfFocus) {
        this.areaOfFocus = areaOfFocus;
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Social Worker [" + super.toString() + ", Area of Focus: " + areaOfFocus + 
               ", Students: " + String.join(", ", students) + "]";
    }
}
