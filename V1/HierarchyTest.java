import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HierarchyTest {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        Director director = new Director("John Doe", "1975-05-20", "21 Admin St.", "Administration", "Jane Smith");
        Secretary secretary1 = new Secretary("Jane Smith", "1980-03-15", "15 Secretary St.", "A102");
        Secretary secretary2 = new Secretary("Tom Wilson", "1982-04-25", "16 Secretary St.", "B203");

        Student student1 = new Student("Charlie Kelmeckis", "2007-12-24", "789 School Rd.", 10);
        Student student2 = new Student("Emma Watson", "2006-03-10", "456 School Rd.", 11);
        Student student3 = new Student("Jake Paul", "2008-08-14", "123 School Rd.", 9);

        // Teacher with a secretary
        Teacher teacher1 = new Teacher("Bill Anderson", "1970-11-30", "321 Teacher Rd.", "Mathematics",
                                        Optional.of("Tom Wilson"),
                                        new String[]{"Charlie Kelmeckis", "Emma Watson"});
        
        // Teacher without a secretary
        Teacher teacher2 = new Teacher("Susan Miller", "1982-01-22", "654 Teacher Rd.", "Biology",
                                        Optional.empty(),
                                        new String[]{"Jake Paul"});

        people.add(director);
        people.add(secretary1);
        people.add(secretary2);
        people.add(student1);
        people.add(student2);
        people.add(student3);
        people.add(teacher1);
        people.add(teacher2);

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
