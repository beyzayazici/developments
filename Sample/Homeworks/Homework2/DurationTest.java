
public class DurationTest {
	public static void run() {

		java.util.Scanner kb = new java.util.Scanner(System.in);

		System.out.println("*** Soru 2 : Saniyeyi Saat, Dakika ve Saniye Cinsinden Yazdırma ***");
		System.out.print("Zamanı giriniz : ");
		long val = Integer.parseInt(kb.nextLine());

		Duration.displayDuration(val);

	}
}
