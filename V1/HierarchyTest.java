import java.util.ArrayList;
import java.util.List;

public class HierarchyTest {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Director("John Doe", "1975-05-20", "21 Admin St.", "Administration"));
        people.add(new Secretary("Jane Smith", "1980-03-15", "15 Secretary St.", "A102"));
        people.add(new Student("Charlie Kelmeckis", "2007-12-24", "789 School Rd.", 10));
        people.add(new Teacher("Bill Anderson", "1970-11-30", "321 Teacher Rd.", "Mathematics"));
        people.add(new SocialWorker("Alice Burton", "1985-07-18", "21 Social Rd", "Mental Health"));

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
