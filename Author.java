import java.io.*;
import java.util.*;
class Author
{
	String firstname,lastname,first,last;
	Scanner sc = new Scanner(System.in);
	public void setFirstName(String first)
	{
		firstname = first;
	}
	public void setLastName(String last)
	{
		lastname = last;
	}
	public void getfirstname()
	{
		System.out.println("First name is: " +firstname);
	}
	public void getlastname()
	{
		System.out.println("Last name is: " +lastname);
	}
	public static void main(String args[])
	{
		Author ob = new Author();
		ob.setFirstName("Ritobrita");
		ob.setLastName("De");
		ob.getfirstname();
		ob.getlastname();
	}
}