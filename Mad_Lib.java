import java.util.Scanner;

public class Mad_Lib {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String noun;
        String verb;
        String adverb;
        String adjective;


        System.out.print("Enter a noun: ");
        noun = input.next();

        System.out.print("Enter a verb: ");
        verb = input.next();

        System.out.print("Enter a adverb: ");
        adverb = input.next();

        System.out.print("Enter a adjective: ");
        adjective = input.next();


        System.out.print("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");

        input.close();

    }

}