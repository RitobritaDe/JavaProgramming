import java.io.*;
import java.util.*;
class Calculator
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in);
		int a,b, c;
		System.out.println("Enter your choice: ");
		a = sc.nextInt();
		System.out.println("Enter two numbers:  ");
		b = sc.nextInt();
		c = sc.nextInt();
		switch (a)
		{
			case 1: 
				System.out.println("Sum is: " + (b+c));
				break;
			case 2:
				System.out.println("Subraction is: " +(b-c));
				break;
			case 3:
				System.out.println("Multiplication is: " + (b*c));
				break;
			case 4:
				System.out.println("Division is: " + (b/c));
				break;
			case 5:
				System.out.println("Modulus is: " + (b%c));
				break;
		}
	}
}
	
	
