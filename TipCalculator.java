import java.util.Scanner;
import java.lang.System;

public class TipCalculator{


    public static void main(String[] args) {

        float billAmount = 0;
        float tip = 0;
        float tipRate = 0;
        float total = 0;

        Scanner valueInput = new Scanner(System.in);

        System.out.print("Digite o total do consumo: ");
        billAmount = valueInput.nextFloat();

        System.out.print("Qual a porcentagem da gorgeta: ");
        tipRate = valueInput.nextFloat();

        tip = Math.abs(billAmount*(tipRate/100));
        total = tip + billAmount;

        System.out.println("O valor da gorgeta e: " +  tip);
        System.out.println("O valor total a pagar e: " + total);

        valueInput.close();

        //System.out.println(billAmount);

    }


}