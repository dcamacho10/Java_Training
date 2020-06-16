/*
The goal of this exercise is to solve the hypotenuse of a right triangle, given the lengths of the other two sides. Note that the formula for calculating the hypotenuse of a right-angled triangle is as follows: h2 = a2 + b2
*/

import simpletrigonometryproblem.Hypotenuse;

public class Workshop_One {

    public static void main(String[] args) {
        Hypotenuse calc = new Hypotenuse(3.0, 4.0);
        System.out.println(calc.result());
    }
    
}