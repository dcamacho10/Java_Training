import java.util.Scanner;

public class Pizza_Party {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int people;
        int pizza;

        System.out.print("How many people? ");
        people = Integer.parseInt(input.next());
        System.out.print("How many pizzas do you have? ");
        pizza = Integer.parseInt(input.next());

        System.out.println(people + " people with " + pizza + " pizzas.");
        System.out.println("Each person gets " + (pizza * 8)/people + " pieces of pizza");
        System.out.println("There are " + (pizza * 8)%people + " leftover pieces.");

        input.close();

    }

}