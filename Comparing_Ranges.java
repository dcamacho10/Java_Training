/*
NOT USING TRY CATCH
TRYING TO USE THE BASIC OF THE FIRST TWO CHAPTERS

Write an application that takes two numbers, the systolic blood pressure and the diastolic blood pressure. Convert both inputs into int values.

1 - Check if there is the right number of inputs at the beginning of the program. Print an error message if any inputs are missing. Exit the application in this case.

2 - Compare against the ideal rates mentioned previously. Output a message describing the inputs as low, ideal, pre-high, or high blood pressure.

3 - To print an error message, use System.err.println instead of System.out.println.

4 - Try out your program with a variety of inputs to ensure it works properly.

The blood pressure is typically reported as systolic blood pressure/diastolic blood pressure.

*/

public class Comparing_Ranges {


    /**
     * @param args
     */
    public static void main(String[] args) {

    final int NUMOFARG = 2;
    int systolicBloodPressure;
    int diastolicBloodPressure;
    String systolicBloodPressureResult;
    String diastolicBloodPressureResult;

        if(args.length != NUMOFARG){
            System.err.println("There are not arguments enough. \nClosing....");
            System.exit(1);
        }else{
            systolicBloodPressure = Integer.parseInt(args[0]);
            diastolicBloodPressure = Integer.parseInt(args[1]);

            if (systolicBloodPressure <  90 ) {
                systolicBloodPressureResult = "low blood pressure";
            }else if(systolicBloodPressure >  90 && systolicBloodPressure <  120  ){
                systolicBloodPressureResult = "good blood pressure";
            }else if(systolicBloodPressure >  120 && systolicBloodPressure <  140  ){
                systolicBloodPressureResult = "pre-high blood pressure";
            }else {
                systolicBloodPressureResult = "high blood pressure";
            }


            if (diastolicBloodPressure <  60 ) {
                diastolicBloodPressureResult = "low blood pressure";
            }else if(diastolicBloodPressure >  60 && systolicBloodPressure <  80  ){
                diastolicBloodPressureResult = "good blood pressure";
            }else if(diastolicBloodPressure >  80 && systolicBloodPressure <  90  ){
                diastolicBloodPressureResult = "pre-high blood pressure";
            }else {
                diastolicBloodPressureResult = "high blood pressure";
            }

            System.out.println("Systolic Blood Result: " +  systolicBloodPressureResult + "\nDiastolic Blood Result: " + diastolicBloodPressureResult);

        }

    }

}