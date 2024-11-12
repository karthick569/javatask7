package task7;

import java.util.Scanner;

import javax.imageio.IIOException;

public class Question3 {

	public static void main(String[] args) 
	{ Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        try {
            validateAge(age);
            System.out.println("Age is valid: " + age);
        } catch (Exception e) 
        {
            System.out.println("Error: " + e.getMessage());
        } 
            scanner.close();
 }
    private static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new Exception("Age must be 18 or older.");
        }
	}

}
