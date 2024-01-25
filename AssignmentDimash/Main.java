import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        // Add employees and students to the list
        people.add(new Employee("Ibragim", "Kuandyk", "Manager", 27045.78));
        people.add(new Student("Davlat", "Sunnatov", 2.5));
        people.add(new Student("Dimash", "Altabekov", 3.0));
        people.add(new Employee("Alikhan", "Borash", "Manager", 50000.00));

        // Sort the list based on payment amount
        Collections.sort(people);

        // Call the printData method
        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}


