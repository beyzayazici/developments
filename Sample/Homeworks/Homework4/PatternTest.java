
public interface PatternTest {
	public static void run() {
		java.util.Scanner kb = new java.util.Scanner(System.in);

		System.out.println("*** Soru 4 : Desen Oluşturma ***");
		System.out.print("Desenin genişliğini giriniz : ");
		int width = Integer.parseInt(kb.nextLine());

		System.out.print("Desenin yüksekliğini giriniz : ");
		int height = Integer.parseInt(kb.nextLine());

		Pattern.drawPattern(width, height);
	}
}
