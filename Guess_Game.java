import java.util.Scanner;

public class Guess_Game {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int guess = 0;
        String reStart = " ";


        do{
            int randomNumber = (int)((Math.random() * 100)) + 1;
            int tentative = 0;
            System.out.println("Guess a number between 1 and 100:");
            guess = input.nextInt();
            tentative++;

            while(guess!= randomNumber){
                if(guess < randomNumber){
                    System.out.println("The number is higher. Try Again.");
                    guess = input.nextInt();
                    tentative++;
                }

                if(guess > randomNumber){
                    System.out.println("The number is lower. Try Again.");
                    guess = input.nextInt();
                    tentative++;
                }

            }

            System.out.println("Congratulations! you hit it after " + tentative + " tentative!");
            System.out.println("Do you want to play again?");
            reStart = input.next();
        }while(reStart.equalsIgnoreCase("Yes"));

        input.close();
    }
}