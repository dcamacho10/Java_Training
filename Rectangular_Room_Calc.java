
public class Rectangular_Room_Calc {

    private int lengthFeet;
    private int widthFeet;


    Rectangular_Room_Calc(int length, int width){
        this.lengthFeet = length;
        this.widthFeet = width;
    }


    /**
     * @return int
     */
    public int squareFeet(){
        return this.lengthFeet * this.widthFeet;
    }

}