import java.util.Scanner;

public class DDayCalculator {
    public static void main(String[] args) {
        // Input the Start Date
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a start date (YYYYMMDD):");
        String startDateStr = scanner.nextLine();

        // Input End Date
        System.out.println("Enter an end date (YYYYMMDD):");
        String endDateStr = scanner.nextLine();

        // Calculate D-Days
        long daysUntilEndDate = calculateDDay(startDateStr, endDateStr);

        // Print the result
        System.out.println("D-day: " + daysUntilEndDate + " days.");

        scanner.close();
    }

    // Calculate D-Day
    private static long calculateDDay(String startDateStr, String endDateStr) {
        int startYear = Integer.parseInt(startDateStr.substring(0, 4));
        int startMonth = Integer.parseInt(startDateStr.substring(4, 6));
        int startDay = Integer.parseInt(startDateStr.substring(6));

        int endYear = Integer.parseInt(endDateStr.substring(0, 4));
        int endMonth = Integer.parseInt(endDateStr.substring(4, 6));
        int endDay = Integer.parseInt(endDateStr.substring(6));

        // Convert start date to days
        long startDays = daysSinceEpoch(startYear, startMonth, startDay);

        // Convert end date to days
        long endDays = daysSinceEpoch(endYear, endMonth, endDay);

        // Calculate difference in days
        return endDays - startDays;
    }

    // Calculate days since epoch (1970-01-01)
    private static long daysSinceEpoch(int year, int month, int day) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        long days = year * 365L + day;
        for (int i = 0; i < month - 1; i++) {
            days += daysInMonth[i];
        }
        if (month > 2 && isLeapYear(year)) {
            days += 1;
        }
        return days;
    }

    // Check if it's a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
