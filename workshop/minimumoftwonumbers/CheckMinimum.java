package minimumoftwonumbers;

public class CheckMinimum {
    private double numberOne;
    private double numberTwo;

    public CheckMinimum(double numOne, double numTwo){
        numberOne = numOne;
        numberTwo = numTwo;
    }

    public void result(){
        System.out.print("The minimum of numbers: " + numberOne + " and " + numberTwo + " is " + Math.min(numberOne, numberTwo));
    }
    
}