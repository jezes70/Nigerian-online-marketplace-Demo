package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;



public class Util {

    public static String enterString(String title) {
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer;
    }

    public static int enterInteger(String title) {
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        scanner.nextLine();
        return answer;
    }

    public static String fillUserInfo() {
        String nameSurname = enterString("Enter name and surname");
        String email = enterString("Enter your email");
        String phone = enterString("Enter your phone number");
        return "name: " + nameSurname + ", email: " + email + ", phone: " + phone;
    }

    public static String fillTripInfo() {
        String Location = enterString("Your current Location");
        int passenger = enterInteger("How many passengers will travel?");
        String requires = enterString("Enter Requires: For example:(SMOKING-YES," +"PET-YES,Luggage)");
        String dateString = enterString("Enter the date of the trip (YYYY-MM-DD)");
        String timeString = enterString("Enter the time of the trip (HH:mm AM/PM)");
        return "Your destination from "+ Location + " with " + passenger +
                " passenger and with these requires" + " "+ requires+" in "+dateString+" in "+timeString;
    }

        public static String enterStringWithValidation(String title, String dateFormatPattern) {
            SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatPattern);
            String userInput;
            while (true) {
                System.out.println(title);
                Scanner scanner = new Scanner(System.in);
                userInput = scanner.nextLine();
                try {
                    dateFormat.parse(userInput);
                    break;
                } catch (ParseException e) {
                    System.out.println("Invalid date format. Please enter the date in " + dateFormatPattern + " format.");
                }
            }
            return userInput;
        }

    
    
}
