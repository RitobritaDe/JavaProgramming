import java.io.*;
import java.util.*;
class ExceptionTest
{
	static void check(String reg, String mob)
	{
		try
		{
			if ((reg.length() != 9)||(mob.length() != 10))
			{
				throw new Exception("IllegalArgumentException");
			}
			else if ((mob.matches("[0-9]+") == false))
			{
				throw new Exception("NumberFormatException");
			}
			else if ((reg.matches("[0-9a-zA-Z]+") == false))
			{
				throw new Exception("NoSuchElementException");
			}
			else
			{
				System.out.println("Valid");
			}
		}
		catch (Exception e)
		{
			 System.out.println(e);
			 System.out.println("Not Valid");
		}
	}
	public static void main(String args[])
	{
		String reg,mob;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter registration number: ");
		reg = sc.nextLine();
		System.out.print("Enter mobile number: ");
		mob = sc.nextLine();
		check(reg,mob);
	}
}