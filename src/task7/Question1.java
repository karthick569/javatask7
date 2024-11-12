package task7;
import java.util.Scanner;
public class Question1 {
    
	public static void main(String[] args)
	{
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer (dividend): ");
        int dividend = scanner.nextInt();
        
        System.out.print("Enter the second integer (divisor): ");
        int divisor = scanner.nextInt();
        
        try {

            int result = dividend / divisor;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) 
        {
            System.out.println(" Division by zero is not allowed.");
        } 
          scanner.close();
        }

}
