
public class FriendsNumbersTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Lütfen birinci değeri giriniz : ");
		int val1 = Integer.parseInt(kb.nextLine());
		System.out.print("Lütfen ikinci değeri giriniz : ");
		int val2 = Integer.parseInt(kb.nextLine());
		
		FriendsNumbers.printResults(val1, val2);
		FriendsNumbers.find4DigitsNumbersAreFriends();
		
	}
}
