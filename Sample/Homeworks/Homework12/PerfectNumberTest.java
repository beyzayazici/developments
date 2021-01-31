
public class PerfectNumberTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Lütfen bir değer giriniz : ");
		int val = Integer.parseInt(kb.nextLine());
		
		PerfectNumber.printResults(val);
	}
}
