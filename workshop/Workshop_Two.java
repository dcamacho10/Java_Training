/*Write a program that will check two numbers entered as variables and print out the message "The minimum of numbers: XX and YY is ZZ", where XX, YY, and ZZ represent the values of the two variables and the result of the operation, respectively. 
*/
import minimumoftwonumbers.CheckMinimum;

public class Workshop_Two {
    public static void main(String[] args) {
        double numberOne = 4.0;
        double numberTwo = 4.2;
        CheckMinimum calc = new CheckMinimum(numberOne, numberTwo);

        calc.result();

    }
    
}