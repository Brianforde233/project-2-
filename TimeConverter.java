import java.util.Scanner;
   /**.
   * digital time that accepts raw time
   * Author Brian Forde-Comp1210-001
   @version 9/04/20
   */
public class TimeConverter {
   /**.
   * using divison and remainder operator 
   * 
  *@param args Command line arguments- not used 
  */
  
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int rawSeconds;
      int days;
      int hours;
      int minutes;
      int seconds;
   
      System.out.print("Enter the raw time measurement in seconds: ");
      rawSeconds = userInput.nextInt();
      
   
      if (rawSeconds < 0)
      {
         System.out.println("Measurement must be non-negative! ");
      
      }
      else {
         System.out.println();
         System.out.println("Measurement by combined days, "
             + "hours, minutes, seconds: ");
       
       
                  
         days = (rawSeconds) / 86400;
         hours = (rawSeconds % 86500) / 3600;
         minutes = ((rawSeconds % 86400) % 3600) / 60;
         seconds = (rawSeconds % 60);
        
         System.out.println("\tdays: " + days);
         System.out.println("\thours: " + hours);
         System.out.println("\tminutes: " + minutes);
         System.out.println("\tseconds: " + seconds);
         System.out.println();
         
         
         System.out.println(rawSeconds + " seconds = " + days + ""
            + " days, " + hours + " hours, " + minutes + " minutes, "
            + seconds + " seconds");
                      
         
      }
   }
}  
  
      
      
   
