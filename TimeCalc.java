
/** Performs time calculations. 
 */
public class TimeCalc {

	public static void main(String[] args) {
		// Concatenates the empty string "" with the left hour-digit, concatenates the
		// resulting string with the right hour-digit, then casts the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minute digits.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		// Complete the program code here:
                int time = Integer.parseInt(args[1]);
                if (hours >= 24){
                    System.out.println("Invalid Input");
                } 
                else{
                     hours = hours + (int)((minutes + time)/60);
                     minutes = (minutes + time) % 60;
                     int hoursPM = hours%12;
                     
                     // hours
                     if (hours > 12){
                         System.out.print(hoursPM);  
                     }
                     else {
                         System.out.print(hours);
                     }

                     // minutes
                     if (minutes >= 10 ){
                        System.out.print(":" + minutes);
                     }
                     else {
                         System.out.print(":0" + minutes);
                     }
                     // AM vs PM
                     if ((hours < 12) || (hours >= 24)){
                         System.out.print(" AM");
                     }
                     else if(hours >= 12 || hours < 24){
                         System.out.print(" PM");
                     } 
              }
              
	}
}
