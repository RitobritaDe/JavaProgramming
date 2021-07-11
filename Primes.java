package primespackage;
import java.io.*;

public class Primes
{
	public void checkForPrime(int x)
	{
	   int  flag = 0;
		for(int i = 2; i < x; i++)
		{
			if (x % i == 0)
			{
				flag++;
				break;
			}
			else
			{
				continue;
			}
		}
		if (flag == 0)
		{
			System.out.println(x);
		}
	}
}

