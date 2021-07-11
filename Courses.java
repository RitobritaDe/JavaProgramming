import java.util.*;
import java.io.*;

class Courses
{
    	static HashMap<String,String[]> h1=new HashMap<>();
    	static HashMap<String,Integer> h2=new HashMap<>();
    	static void add()
    	{
        		Scanner sc=new Scanner(System.in);
				System.out.println("Enter name: ");
				String s=sc.nextLine();
				System.out.println("Enter number of subjects: ");
        		int n=sc.nextInt();
        		sc.nextLine();
        		String sub[]=new String[n];
        		System.out.println("Enter name of subjects");
        		for(int i=0;i<n;i++)
        		{
           	 		sub[i]=sc.nextLine();
       	 		}
       	 	h1.put(s,sub);
    	}
   		static void remove()
    	{
        		System.out.println("Enter name of student to be removed");
        		Scanner sc=new Scanner(System.in);
        		String s=sc.nextLine();
        		h1.remove(s);
    	}
    	static void iterate()
    	{
        		Iterator it=h1.entrySet().iterator();
        		while(it.hasNext())
        		{
            			Map.Entry pair=(Map.Entry)it.next();
            			System.out.println("name: "+pair.getKey()+" Subjects: "+pair.getValue());
        		}
    	}
    	static void search()
    	{
        		System.out.println("Enter name of student to be searched");
        		Scanner sc=new Scanner(System.in);
        		String s=sc.nextLine();
        		String sub[]=h1.get(s);
        		int l=sub.length;
        		System.out.println("subject and facult list");
        		for(int i=0;i<l;i++)
        		{
            			System.out.println("subject: "+sub[i]+" faculty: "+h2.get(sub[i]));
        		}
    	}
   	public static void main(String[] args) 
   	{
         		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of students");
		int n1 = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n1; i++)
		{
			System.out.print("Enter student name: ");
			String student = sc.nextLine();
			//sc.nextLine();
			System.out.print("Enter number of courses: ");
			int x = sc.nextInt();
			sc.nextLine();
			String courses[] = new String[x];
			for(int k = 0; k<x; k++)
			{
				System.out.print("Enter courses: ");
				courses[k] =  sc.nextLine();
			}
			h1.put(student, courses);
		}
		System.out.println(h1);
		System.out.print("Enter number of courses");
		int n2 = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n2; i++)
		{
			System.out.print("Enter Course name");
			String course = sc.nextLine();
			System.out.print("Enter faculty");
			int fac =  sc.nextInt();
			sc.nextLine();
			h2.put(course, fac);
		}
		System.out.println(h2);
		sc.nextLine();

         		System.out.println("Enter choice of operation:");
         		System.out.println("1: Add 2: Remove 3: Iterate 4: Search and Iterate");
         		int c=sc.nextInt();
         		switch(c)
         		{
             			case 1:add(); System.out.println(h1); break;
             			case 2:remove(); System.out.println(h1); break;
             			case 3:iterate();break;
             			case 4:search();break;
             			default:System.out.println("invalid choice");break;
         		}       
   	}
}
