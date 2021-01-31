
public class NumberUtilTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Lütfen bir değer giriniz : ");
		int val = Integer.parseInt(kb.nextLine());
		
		System.out.printf("%d sayısının kendisi hariç pozitif bölenlerinin toplamı = %d", val, NumberUtil.sumFactors(val));
		
	}
}
