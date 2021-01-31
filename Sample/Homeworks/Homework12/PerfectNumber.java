
public class PerfectNumber {
	public static boolean isPerfect(int val)
	{
		int valPowOfTwo;
		int newVal = 0;
		int p, p2;
		
		//According to Oklit; perfect numbers are found by this formula ->  2^(p−1)x(2^p−1) 
		//Conditions : p and (2^p−1)  have to be prime
		
		valPowOfTwo = (int) (Math.log(val) / Math.log(2)) + 1;
		
		p = (valPowOfTwo + 1) / 2;
		p2 = (int) (Math.pow(2, p) - 1);
		
		if(isPrime(p) && isPrime(p2))
			newVal = (int) (Math.pow(2, p - 1) * p2);
		
		return newVal == val ? true : false;
	}
	
	public static void printResults(int val)
	{
		if(PerfectNumber.isPerfect(val))
			System.out.printf("%d mükemmel bir sayıdır.%n", val);
		else
			System.out.printf("%d mükemmel bir sayı değildir.%n", val);
		
		System.out.printf("4 basamaklı tek mükemmel sayı : %d'dır.%n", find4DigitPerfect());
	}
	
	public static int find4DigitPerfect()
	{
		// all perfect number is even so we don't need to look odd number
		for (int i = 1000; i < 10000; i += 2) 
			if(isPerfect(i)) 
				return i;
		return 0;
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
