public class Teacher extends Person {
    private String subject;

    public Teacher(String name, String birthday, String address, String subject) {
        super(name, birthday, address);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
