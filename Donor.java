import java.io.*;
import java.util.*;

class Donor
{
	static String name,address,bg; 
	static int age,num,date;
	Donor(String name,int age,String address,int num,String bg,int date)
		{
			this.name = name;
			this.age = age;
			this.address = address;
			this.num = num;
			this.bg = bg;
			this.date = date;
		}
	
	public void display()
	{
		System.out.println("The name of the donor is: " +name);
		System.out.println("The age of the donor is: " +age);
		System.out.println("The address of the donor is: " +address);
		System.out.println("The contact number of the donor is: " +num);
		System.out.println("The blood group of the donor is: " +bg);
		System.out.println("The date of the donation is: " +date);
	}

	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter number of Donors: ");
		n = sc.nextInt();
		FileOutputStream f = new FileOutputStream("C:/Users/Ritobrita/Desktop/donor.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		for (int i = 0; i < n; i++)
		{
			sc.nextLine();
			System.out.print("Enter name: ");
			name = sc.nextLine();
			System.out.print("Enter age: ");
			age = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter address: ");
			address = sc.nextLine();
			System.out.print("Enter Contact info: ");
			num = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter blood group: ");
			bg = sc.nextLine();
			System.out.print("Enter date ");
			date = sc.nextInt();
			sc.nextLine();
			Donor ob = new Donor(name,age,address,num,bg,date);
			o.writeObject(ob);
		}
		FileInputStream fs = new FileInputStream("C:/Users/Ritobrita/Desktop/donor.txt");
		ObjectInputStream os = new ObjectInputStream(fs);
		for (int i = 0; i < n; i++)
		{
			Donor ob1 = (Donor)os.readObject();
			int today = 11032019;
			if (ob1.bg == "A+ve")
			{
				ob1.display();
			}
		}
	}
	
	
}