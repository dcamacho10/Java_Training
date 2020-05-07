import java.util.Scanner;

public class Counting_The_Num_Of_Char {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String inputString;
        int count;

        System.out.print("What is the input string? ");

        inputString = input.nextLine();
        count = inputString.length();

        System.out.print(inputString + " has " + count + " characters.");

        input.close();
    }
}