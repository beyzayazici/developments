
public class Prime {
	public static boolean isPrimeX(int val) 
	{
		int val2 = val;
		if(isPrime(val)) {
			for(int i = 1; i <= countDigits(val2); i++) {
				val2 = getDigitsSum(val2);
				if(isPrime(val2)) {
					if(val2 < 9)
						return true;
				}
				else
					break;
			}
				
		}
		
		return false;
	}

	public static int getDigitsSum (int number) 
	{
		
		int sum = 0;
		
		while (number > 0) {
			sum = sum + number % 10;
		    number = number / 10;
		}
		
		return sum;
	}
	
	public static int countDigits (int number) 
	{
		
		int counter = 0;
		
		while (number > 0) {
		    number = number / 10;
		    counter++;
		}
		
		return counter;
	}

	public static boolean isPrime(int val) 
	{
		if (val <= 1)
			return false;

		if (val % 2 == 0)
			return val == 2;

		if (val % 3 == 0)
			return val == 3;

		if (val % 5 == 0)
			return val == 5;

		if (val % 7 == 0)
			return val == 7;

		for (int i = 11; i * i <= val; i += 2)
			if (val % i == 0)
				return false;

		return true;
	}
}
