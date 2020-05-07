/*
Constraints

    Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.

    Keep the inputs and outputs separate from the numerical conversions and other processing.

    Generate a single output statement with line breaks in the appropriate spots.
*/

import java.util.Scanner;

public class Simple_Calc {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        System.out.print("What is the first number? ");
        firstNumber = Integer.parseInt(input.nextLine());
        System.out.print("What is the second number? ");
        secondNumber = Integer.parseInt(input.nextLine());


        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber) + "\n"
                            + firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber) + "\n"
                            + firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber) + "\n"
                            + firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber) + "\n");

        input.close();

    }

}