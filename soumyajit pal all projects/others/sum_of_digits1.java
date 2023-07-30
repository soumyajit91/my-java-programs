package others;

import java.io.*;

class sum_of_digits1
{
	
	static int sum_of_digit(int n)
	{
		if (n == 0)
			return 0;
		System.out.println (n % 10) ;
		return sum_of_digit(n / 10);
	}

	
	public static void main(String args[])
	{
		int num = 12345;
		int result = sum_of_digit(num);
		
	}
}


