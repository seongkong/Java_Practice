import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    private static List<Person> persons = new ArrayList<>();  // 모든 Person 객체를 저장하는 단일 리스트

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter contact details, 'print' to display all contacts, or 'sort name' to sort by name:");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("print")) {
                printContacts();
                continue;
            } else if (input.equalsIgnoreCase("sort name")) {
                Collections.sort(persons);
                printContacts();
                continue;
            }
            addPerson(input);
        }
    }

    private static void addPerson(String input) {
        String[] details = input.split(", ");
        String type = details.length > 0 ? details[0] : "Not Yet Defined";
        String department = details.length > 1 ? details[1] : "Not Yet Defined";
        String name = details.length > 2 ? details[2] : "Not Yet Defined";
        String id = details.length > 3 ? details[3] : "Not Yet Defined";
        String email = details.length > 4 ? details[4] : "Not Yet Defined";

        switch (type.toLowerCase()) {
            case "under":
                persons.add(new Under(department, name, id, email));
                break;
            case "grad":
                persons.add(new Grad(department, name, id, email));
                break;
            case "faculty":
                persons.add(new Faculty(department, name, id, email));
                break;
            case "staff":
                persons.add(new Staff(department, name, id, email));
                break;
            default:
                System.out.println("Invalid type: " + type);
                break;
        }
    }

    private static void printContacts() {
        System.out.println("Printing all contacts in the order they were entered...");
        for (Person person : persons) {
            person.writeOutput();
        }
    }
}
