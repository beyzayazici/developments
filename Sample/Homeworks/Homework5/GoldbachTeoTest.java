
public class GoldbachTeoTest {
	public static void findPrime(int val) {
		int counter = 2;
		boolean flag = true;

		int val1, val2;

		if (val < 2 || val % 2 != 0)
			System.out.println("Geçersiz bir sayı girdiniz.");

		else
			while (flag) {
				val1 = counter;
				val2 = val - val1;
				if (GoldbachTeo.isPrime(val1) && GoldbachTeo.isPrime(val2)) {
					System.out.printf("%d = %d + %d", val, val1, val2);
					flag = false;
				}
				counter++;
			}

	}

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
}
