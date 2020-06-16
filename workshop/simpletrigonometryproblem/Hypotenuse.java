package simpletrigonometryproblem;

public class Hypotenuse {
    private double onCathetus;
    private double oppositeCathetus;


    public Hypotenuse(double onCat, double oppCat){
        onCathetus = onCat;
        oppositeCathetus = oppCat;
    }

    public double result(){
        return Math.sqrt(Math.pow(onCathetus, 2) + Math.pow(oppositeCathetus, 2));
    }
    
}