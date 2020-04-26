import java.util.Scanner;

public class Say_Hello {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;

        System.out.print("What is your name? ");
        name = input.next();
        System.out.println("Hello, " + name + ", Nice to meet you!");

        input.close();
    }

}