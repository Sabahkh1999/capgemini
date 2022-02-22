import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		System.out.println("enter a number between 1 and 10");
		                 
		try {
		    int num = keyboard.nextInt();
		    if (num < 1 || num > 10) {
		        throw new InvalidNumberException();
		}
		}
		    catch (InvalidNumberException e) {
		    System.out.println(e.getMessage ());
		}
	}
}
