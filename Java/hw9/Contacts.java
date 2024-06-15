import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contacts {
    private List<Contact> contacts;

    public Contacts() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void displayContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". " + contacts.get(i));
        }
    }

    public void deleteContact(int index) {
        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
            System.out.println("Contact removed.");
        } else {
            System.out.println("Invalid contact number.");
        }
    }

    // Load contacts from a text file
    public void loadFromTextFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    contacts.add(new Contact(parts[0], parts[1], parts[2]));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Save contacts to a text file
    public void saveToTextFile(String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Contact contact : contacts) {
                bw.write(contact.getName() + "," + contact.getPhone() + "," + contact.getEmail());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    // Save contacts to a binary file
    public void saveToBinaryFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(contacts);
        } catch (IOException e) {
            System.out.println("Error writing binary file: " + e.getMessage());
        }
    }

    // Load contacts from a binary file
    @SuppressWarnings("unchecked")
    public void loadFromBinaryFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            contacts = (List<Contact>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading binary file: " + e.getMessage());
        }
    }

    // Handling invalid input and adding a single contact
    public void handleInvalidInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                if (name.isEmpty()) {
                    throw new IllegalArgumentException("Name cannot be empty");
                }

                System.out.print("Enter phone: ");
                String phone = scanner.nextLine();
                if (!phone.matches("\\d+")) { // Check if phone contains only digits
                    throw new IllegalArgumentException("Phone must contain only digits");
                }

                System.out.print("Enter email: ");
                String email = scanner.nextLine();
                if (!email.contains("@") || !email.contains(".")) { // Basic email format check
                    throw new IllegalArgumentException("Invalid email format");
                }

                addContact(new Contact(name, phone, email));
                break; // Exit the loop if all inputs are valid
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + ". Please try again.");
            }
        }
    }
}
