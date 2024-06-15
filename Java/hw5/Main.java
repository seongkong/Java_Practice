import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name or first and last name separated by a comma (e.g., John,Doe):");
        String nameInput = scanner.nextLine();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        Person person = new Person(); // 기본 생성자를 사용해 초기화
        if (nameInput.contains(",")) {
            String[] parts = nameInput.split(",");
            if (parts.length == 2) {
                person.setName(parts[0].trim(), parts[1].trim()); // 첫 번째와 마지막 이름을 설정
            }
        } else {
            person.setName(nameInput); // 전체 이름을 설정
        }
        person.setAge(age);

        String ageGroup = determineAgeGroup(age);
        System.out.println("Created " + person.getName() + ", a " + ageGroup + ", who is " + person.getAge() + " years old.");
    }

    private static String determineAgeGroup(int age) {
        if (age <= 2) {
            return "toddler";
        } else if (age <= 5) {
            return "preschooler";
        } else if (age <= 9) {
            return "adolescent";
        } else if (age <= 15) {
            return "teenager";
        } else {
            return "adult";
        }
    }
}
