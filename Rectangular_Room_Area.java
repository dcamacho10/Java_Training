import java.util.Scanner;

public class Rectangular_Room_Area {


    /**
     * @param args
     */
    public static void main(String[] args) {

        final double conversionFactor = 0.09290304;

        Scanner input = new Scanner(System.in);
        int lengthFeet;
        int widthFeet;
        int squareFeet;
        double squareMeters;

        System.out.print("What is the length of the room in feet? ");
        lengthFeet = Integer.parseInt(input.next());
        System.out.print("What is the width of the room in feet? ");
        widthFeet = Integer.parseInt(input.next());

        squareFeet = lengthFeet * widthFeet;
        squareMeters = squareFeet * conversionFactor;

        System.out.println("The are is");
        System.out.println(squareFeet + " square feet");
        System.out.println(squareMeters + "square meters");


        input.close();

    }

}