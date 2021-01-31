
public class Special3DigitsNumber {
	public static void findNumber() 
	{

		// number of step = 448
		for (int abc = 103; abc < 999; abc += 2) 
			if (provideConditions(abc))
				System.out.println(abc);

	}

	public static boolean provideConditions(int abc) 
	{

		int a = abc / 100;
		int b = abc / 10 % 10;
		int c = abc % 10;

		if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0)
			return false;

		int cba = c * 100 + b * 10 + a;
		int ab = a * 10 + b;
		int bc = b * 10 + c;
		int cb = c * 10 + b;
		int ba = b * 10 + a;

		if (cba > abc && isAllNumbersPrime(abc, cba, ab, bc, cb, ba))
			return true;

		return false;
	}
	
	public static void findNumberMoreSpeedy() 
	{

		// number of step = 50
		for (int c = 9; c > 1; c -= 2)
			for (int b = 1; b <= 9; b += 2)
				for (int a = c - 2; a >= 1; a -= 2) {
					int abc = 100 * a + 10 * b + c;
					if (provideConditionsMoreSpeedy(abc, a, b, c)) 
						System.out.println(abc);
				}
	}

	public static boolean provideConditionsMoreSpeedy(int abc, int a, int b, int c) 
	{
		int cba = c * 100 + b * 10 + a;
		int ab = a * 10 + b;
		int bc = b * 10 + c;
		int cb = c * 10 + b;
		int ba = b * 10 + a;

		if (cba > abc && isAllNumbersPrime(abc, cba, ab, bc, cb, ba))
			return true;

		return false;
	}

	public static boolean isAllNumbersPrime(int abc, int cba, int ab, int bc, int cb, int ba) 
	{
		return isPrime(abc) && isPrime(cba) && isPrime(ab) && isPrime(bc) && isPrime(cb) && isPrime(ba);
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
