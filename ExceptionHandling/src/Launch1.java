import java.util.Scanner;

public class Launch1 
{

	public static void main(String[] args) 
	{
		System.out.println("Exception Handling");
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number to divide :: ");
		int num1 = sc.nextInt();
		
		
		System.out.print("Enter sercond number to divide :: ");
		int num2 = sc.nextInt();
		System.out.println("The result is :: "+(num1/num2));
		System.out.println("Error Occured");
		}
		catch(Exception E) {
			System.out.println(E);
		}
		System.out.println("Connection terminated");
		
		
		
	}

}
