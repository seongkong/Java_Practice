import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Save Contacts to Text File");
            System.out.println("4. Load Contacts from Text File");
            System.out.println("5. Save Contacts to Binary File");
            System.out.println("6. Load Contacts from Binary File");
            System.out.println("7. Delete Contact");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        contacts.handleInvalidInput();
                        break;
                    case 2:
                        contacts.displayContacts();
                        break;
                    case 3:
                        System.out.print("Enter filename to save: ");
                        String saveTextFile = scanner.nextLine();
                        contacts.saveToTextFile(saveTextFile);
                        break;
                    case 4:
                        System.out.print("Enter filename to load: ");
                        String loadTextFile = scanner.nextLine();
                        contacts.loadFromTextFile(loadTextFile);
                        break;
                    case 5:
                        System.out.print("Enter filename to save: ");
                        String saveBinaryFile = scanner.nextLine();
                        contacts.saveToBinaryFile(saveBinaryFile);
                        break;
                    case 6:
                        System.out.print("Enter filename to load: ");
                        String loadBinaryFile = scanner.nextLine();
                        contacts.loadFromBinaryFile(loadBinaryFile);
                        break;
                    case 7:
                        contacts.displayContacts();
                        System.out.print("Enter the number of the contact to delete: ");
                        int contactNumber = Integer.parseInt(scanner.nextLine());
                        contacts.deleteContact(contactNumber - 1); // Adjust for zero-based index
                        break;
                    case 8:
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}
