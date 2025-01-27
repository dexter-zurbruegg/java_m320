import java.util.Optional;

public class Teacher extends Person {
    private String subject;
    private Optional<String> secretary;
    private String[] students;

    public Teacher(String name, String birthday, String address, String subject, Optional<String> secretary, String[] students) {
        super(name, birthday, address);
        this.subject = subject;
        this.secretary = secretary != null ? secretary : Optional.empty();
        this.students = students;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Optional<String> getSecretary() {
        return secretary;
    }

    public void setSecretary(Optional<String> secretary) {
        this.secretary = secretary;
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher [" + super.toString() +
               ", Subject: " + subject +
               ", Secretary: " + secretary.orElse("No Secretary") +
               ", Students: " + String.join(", ", students) + "]";
    }
}
