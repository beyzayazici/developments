public class PatternTest {
	public static void run() {
		java.util.Scanner kb = new java.util.Scanner(System.in);

		System.out.println("*** Soru 1 : Desen Oluşturma ***");
		System.out.print("Desen için bir sayı giriniz : ");
		int val = Integer.parseInt(kb.nextLine());
		Pattern.drawStars(val);

	}
}
