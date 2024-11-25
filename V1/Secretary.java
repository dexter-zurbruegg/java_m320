public class Secretary extends Person {
    private String officeNumber;

    public Secretary(String name, String birthday, String address, String officeNumber) {
        super(name, birthday, address);
        this.officeNumber = officeNumber;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    @Override
    public String toString() {
        return "Secretary [" + super.toString() + ", Office Number: " + officeNumber + "]";
    }
}
