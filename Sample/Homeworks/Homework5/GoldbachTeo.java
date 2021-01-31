
public class GoldbachTeo {
	public static void run() {
		java.util.Scanner kb = new java.util.Scanner(System.in);

		System.out.println("*** Soru 5 : Goldbach Teoremi (Asal Toplamları Bulma) ***");
		System.out.print("2 den büyük çift bir sayı giriniz : ");
		int val = Integer.parseInt(kb.nextLine());

		GoldbachTeo.findPrime(val);
	}
}
