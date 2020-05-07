import java.util.Scanner;

public class Quotation_Mark {


    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String quote;
        String author;

        System.out.print("What is the quote? ");
        quote = input.nextLine();
        System.out.print("Who said it? ");
        author = input.nextLine();

        System.out.println(author + " says, \"" + quote + "\"");

        input.close();
    }

}