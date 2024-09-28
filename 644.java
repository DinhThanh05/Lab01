import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = 0;
        String monthName = "";
        int year = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter the month (e.g., January, Jan, or 1): ");
            String monthInput = scanner.next();

            System.out.print("Enter the year: ");
            year = scanner.nextInt();

            if (monthInput.matches("^(January|Jan|1)$")) {
                monthName = "January";
                days = 31;
                validInput = true;
            } else if (monthInput.matches("^(February|Feb|2)$")) {
                monthName = "February";
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    days = 29; // Leap year
                } else {
                    days = 28;
                }
                validInput = true;
            } else if (monthInput.matches("^(March|Mar|3)$")) {
                monthName = "March";
                days = 31;
                validInput = true;
            } else if (monthInput.matches("^(April|Apr|4)$")) {
                monthName = "April";
                days = 30;
                validInput = true;
            } else if (monthInput.matches("^(May|5)$")) {
                monthName = "May";
                days = 31;
                validInput = true;
            } else if (monthInput.matches("^(June|Jun|6)$")) {
                monthName = "June";
                days = 30;
                validInput = true;
            } else if (monthInput.matches("^(July|Jul|7)$")) {
                monthName = "July";
                days = 31;
                validInput = true;
            } else if (monthInput.matches("^(August|Aug|8)$")) {
                monthName = "August";
                days = 31;
                validInput = true;
            } else if (monthInput.matches("^(September|Sep|Sept|9)$")) {
                monthName = "September";
                days = 30;
                validInput = true;
            } else if (monthInput.matches("^(October|Oct|10)$")) {
                monthName = "October";
                days = 31;
                validInput = true;
            } else if (monthInput.matches("^(November|Nov|11)$")) {
                monthName = "November";
                days = 30;
                validInput = true;
            } else if (monthInput.matches("^(December|Dec|12)$")) {
                monthName = "December";
                days = 31;
                validInput = true;
            } else {
                System.out.println("Invalid month. Please try again.");
            }
        }

        System.out.println("Month: " + monthName + ", Year: " + year + ", Days: " + days);
        scanner.close();
    }
}