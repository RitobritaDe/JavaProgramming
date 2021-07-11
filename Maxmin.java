import java.io.*;
import java.util.*;
class Maxmin
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] array = readNumsFromCommandLine();
		int max = getMax(array);
		System.out.println("Maximum Value is: "+max);
		int min = getMin(array);
		System.out.println("Minimum Value is: "+min);
	}
	public static int getMax(int[] inputArray)
	{ 
		int maxValue = inputArray[0]; 
		for(int i=1;i < inputArray.length;i++)
		{	
			 if(inputArray[i] > maxValue)
			{ 
         				maxValue = inputArray[i]; 
			} 
    		} 
		return maxValue; 
  	}
  	public static int getMin(int[] inputArray)
	{ 
    		int minValue = inputArray[0]; 
   		 for(int i=1;i<inputArray.length;i++)
		{ 
      			if(inputArray[i] < minValue)
			{ 
        				minValue = inputArray[i]; 
      			} 
    		} 
    		return minValue; 
  	} 
	public static int [] readNumsFromCommandLine() 
	{
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		System.out.println("Enter the number of numbers to compare");
        		s.nextLine();
       		int [] array= new int[count];
		System.out.println("Enter the numbers");
        		Scanner numScanner = new Scanner(s.nextLine());
        		for (int i = 0; i < count; i++) 
		{
            			if (numScanner.hasNextInt()) 
			{
                				array[i] = numScanner.nextInt();
            			} 
			else 
			{
                				System.out.println("You didn't provide enough numbers");
                				break;
           		 	}
        		}

       		return array;
	}
}
	
	
