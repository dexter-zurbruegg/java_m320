public class Director extends Person {
    private String department;

    public Director(String name, String birthday, String address, String department) {
        super(name, birthday, address);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Director [" + super.toString() + ", Department: " + department + "]";
    }
}
