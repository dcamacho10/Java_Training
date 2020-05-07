import java.util.Scanner;

/*
Paint Calculator

Sometimes you have to round up to the next number rather than follow standard rounding rules.

Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.

Remember, you can’t buy a partial gallon of paint. You must round up to the next whole gallon.
*/


public class Paint_Calculator {


    /**
     * @param args
     */
    public static void main(String[] args) {

        final float GALLONSFACTOR = (float)1/350;
        int length;
        int width;
        Scanner input = new Scanner(System.in);
        double gallonsAmount;


        System.out.print("What is the length in feet? ");
        length = Integer.parseInt(input.nextLine());
        System.out.print("What is the length in feet? ");
        width = Integer.parseInt(input.nextLine());

        Rectangular_Room_Calc room_1 = new Rectangular_Room_Calc(length, width);
        gallonsAmount = Math.round(room_1.squareFeet() * GALLONSFACTOR);

        System.out.println("You will need to purchase " + gallonsAmount +" gallons of paint to cover " + room_1.squareFeet() +" square feet.");

        input.close();
    }

}