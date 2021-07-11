import java.util.*;

import java.io.*;
class A extends Thread
{
	
	static int c1;

	static int c2;

	static int c3;

	static int[] arr;

	int mi,ma;
	
	A(int a)
	{

		 mi=(a-1)*(60);

		 ma=a*(60);

	}

	synchronized public void count(int count1,int count2,int count3)
	{

		c1=c1+count1;

		c2=c2+count2;

		c3=c3+count3;
	
}

	static void random() throws Exception
	{
	
		int[] a=new int[240];
	
		Random g=new Random();
	
		for(int i=0;i<240;i++)
		{

			a[i]=g.nextInt(3);
	
		}
	
		arr=a;
	
	}
	
	public void run()
	{

		int count1=0;

		int count2=0;

		int count3=0;

		for(int i=mi;i<ma;i++)
		{

			if(arr[i]==0)

				count1++;

			else if(arr[i]==1)

				count2++;
			
			else

				count3++;
	
		}

		count(count1,count2,count3);
	
	}

}

class PRTest
{

	public static void main(String args[])  throws Exception
	{
	A.random();

		A t1=new A(1);

		A t2=new A(2);
		A t3=new A(3);

		A t4=new A(4);
	
	t1.start();

		t2.start();

		t3.start();
	
	t4.start();
	
	t1.join();
	
	t2.join();

		t3.join();

		t4.join();

		System.out.print("The array cointaining vote is: ");
	
		for(int i=0;i<240;i++)
		{
	
		System.out.print(A.arr[i]+" ");
	
		}
	
		System.out.println();
	
	System.out.println("A Count is: "+A.c1);
	
		System.out.println("B Count is: "+A.c2);
	
		System.out.println("C Count is: "+A.c3);
	
	}

}