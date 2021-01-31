
public class PrimeFactorTest {
	public static void run() {
		java.util.Scanner kb = new java.util.Scanner(System.in);

		System.out.println("*** Soru 3 : Asal Çarpanları Bulma ***");
		System.out.print("Bir sayı giriniz : ");
		int val = Integer.parseInt(kb.nextLine());

		PrimeFactor.findPrime(val);
	}
}
