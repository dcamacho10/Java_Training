import java.util.Scanner;
import java.lang.System;

public class TipCalculator{



    /**
     * @param args
     */
    public static void main(String[] args) {

        float billAmount = 0;
        float tip = 0;
        float tipRate = 0;
        float total = 0;

        Scanner valueInput = new Scanner(System.in);

        try{
            System.out.print("Digite o total do consumo: ");
            billAmount = Float.parseFloat(valueInput.next());

            if(billAmount < 0){
                valueInput.close();
                throw new Exception("O total tem que ser positivo.");
            }

            System.out.print("Qual a porcentagem da gorgeta: ");
            tipRate = Float.parseFloat(valueInput.next());

            tip = Math.abs(billAmount*(tipRate/100));
            total = tip + billAmount;

            System.out.println("O valor da gorgeta e: " +  tip);
            System.out.println("O valor total a pagar e: " + total);

            valueInput.close();
        }
        catch(NumberFormatException numEx){
            System.out.print("Quantidade errada, por favor digitar um numero valido.");
        }
        catch(Exception exc){
            System.out.print(exc.getMessage());
        }
        // catch(NumberFormatException numFormatEx){
        //     System.out.print(numFormatEx.getMessage());
        // }

        //System.out.println(billAmount);

    }


}