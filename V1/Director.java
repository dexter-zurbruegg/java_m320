public class Director extends Person {
    private String department;
    private String secretary;

    public Director(String name, String birthday, String address, String department, String secretary) {
        super(name, birthday, address);
        this.department = department;
        this.secretary = secretary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSecretary() {
        return secretary;
    }

    public void setSecretary(String secretary) {
        this.secretary = secretary;
    }

    @Override
    public String toString() {
        return "Director [" + super.toString() + ", Department: " + department + ", Secretary: " + secretary + "]";
    }
}
