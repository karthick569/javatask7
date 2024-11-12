package task7;

public class Question2 {

	public static void main(String[] args)
	{
        int[] numbers = {10, 20, 30, 40, 50}; 

        try {
            System.out.println("Accessing array element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        String text = "Hello"; 

        try {
            System.out.println("Accessing character at index 5: " + text.charAt(5));
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());
        }
	}

}
