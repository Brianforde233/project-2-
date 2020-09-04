import java.util.Scanner;
   /**.
   * input values of type doulbe x,y,z
   * Author Brian Forde-Comp1210-001
   @version 9/04/20
   */
public class ExpressionResult {
   /**.
   * solves indicated expression when xyz = 0
   * 
  *@param args Command line arguments- not used 
  */
  
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
       
      double x;
      double y;
      double z;
      double result;
     
     // Calculation for xyz input
     // (x - 1.1) (2y + 2.2.) (4z +4.4) / xyz
      System.out.println("result = (x - 1.1) (2y + 2.2) (4z + 4.4) / xyz");
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      System.out.print("\tz = ");
      z = userInput.nextDouble();
      if (x * y * z == 0) {
         System.out.println("result is \"undefined\"");
      }
      else 
      { 
         result = (x - 1.1) * (2 * y + 2.2) * (4 * z + 4.4) / (x * y * z);
         System.out.println("result = " + result);
      }
   }
} 
      
        
