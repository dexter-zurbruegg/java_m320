import java.util.ArrayList;
import java.util.List;

public class HierarchyTest {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        // Create Director
        Director director = new Director("John Doe", "1975-05-20", "21 Admin St.", "Administration", "Jane Smith");

        // Create Secretaries
        Secretary secretary1 = new Secretary("Jane Smith", "1980-03-15", "15 Secretary St.", "A102");
        Secretary secretary2 = new Secretary("Tom Wilson", "1982-04-25", "16 Secretary St.", "B203");

        // Create Students
        Student student1 = new Student("Charlie Kelmeckis", "2007-12-24", "789 School Rd.", 10);
        Student student2 = new Student("Emma Watson", "2006-03-10", "456 School Rd.", 11);
        Student student3 = new Student("Jake Paul", "2008-08-14", "123 School Rd.", 9);

        // Create Teacher
        Teacher teacher = new Teacher("Bill Anderson", "1970-11-30", "321 Teacher Rd.", "Mathematics", 
                                       "Tom Wilson", new String[] { "Charlie Kelmeckis", "Emma Watson" });

        // Create Social Worker
        SocialWorker socialWorker = new SocialWorker("Alice Burton", "1985-07-18", "21 Social Rd", 
                                                     "Mental Health", new String[] { "Emma Watson", "Jake Paul" });

        // Add people to the list
        people.add(director);
        people.add(secretary1);
        people.add(secretary2);
        people.add(student1);
        people.add(student2);
        people.add(student3);
        people.add(teacher);
        people.add(socialWorker);

        // Display each person
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
