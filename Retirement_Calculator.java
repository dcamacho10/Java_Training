import java.util.Calendar;
import java.util.Scanner;

public class Retirement_Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        int retirement;
        Calendar currentTime = Calendar.getInstance();
        int currentYear = currentTime.getWeekYear();

        System.out.print("What is your current age? ");
        age = Integer.parseInt(input.nextLine());
        System.out.print("At what age would you like to retire? ");
        retirement = Integer.parseInt(input.nextLine());

        System.out.println("You have " + (retirement - age) + " years left until you can retire.");
        System.out.println("It's " + currentYear + ", so you can retire in " + (currentYear + (retirement - age)));

        input.close();


    }

}