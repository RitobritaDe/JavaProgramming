import java.io.*;
import java.util.*;
class Bank
{
	 String depositor,type;
	int accnum,balance,ad,sub;
	Scanner sc = new Scanner(System.in);
	void innitdata()
	{
		System.out.print("Enter Balance: ");
		balance = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Name of depositor: ");
		depositor = sc.nextLine();
		System.out.print("Enter Account number: " );
		accnum = sc.nextInt();
		System.out.print("Enter Type of account: ");
		type = sc.nextLine();
		sc.nextLine();
	} 
	void deposit()
	{
		System.out.print("Money deposited: ");
		ad = sc.nextInt();
		balance = balance + ad;
		System.out.println("New balance: " +balance);
	}
	void withdraw()
	{
		System.out.println("Existing balance: " +balance);
		System.out.print("Money to be withdrawn: ");
		sub = sc.nextInt();
		balance = balance - sub;
		System.out.println("New balance: " +balance);
	}
	void display()
	{
		System.out.println("Balance: " +balance);
		System.out.println("Name of depositor: " +depositor);
		System.out.println("Account number: " +accnum);
		System.out.println("Type of account: " +type);
	}
	public static void main (String args[])
	{
		Bank ob = new Bank();
		ob.innitdata();
		ob.deposit();
		ob.withdraw();
		ob.display();
	}
}