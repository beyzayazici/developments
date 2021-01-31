
public class PrimeFactor {
	public static boolean isPrime(int val) {
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

	public static void findPrime(int val) {
		int i = 2;
		int contVal = val;
		boolean flag = true;
		
		if (val == 1 || val < 0)
			System.out.printf("%d sayısının asal çarpanı yoktur.", val);

		else
			while (contVal != 1) {
				if (contVal % i == 0 && PrimeFactor.isPrime(i)) {
					contVal = contVal / i;
					printPrime(flag, val, i);
					if(flag)
						flag = false;
				}

				if (contVal % i != 0)
					i++;
			}
	}
	
	public static void printPrime(boolean isFirst, int val, int primeVal) {
		if(isFirst)
			System.out.printf("%d sayısının asal çarpanları : %d", val, primeVal);
		else
			System.out.print(", " + primeVal);
	}
}
