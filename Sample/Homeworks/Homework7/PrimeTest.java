
public class PrimeTest {
	public static void run() 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.println("*** Soru 2 : Koşulları Sağlayan Asal Sayı Kontrolü ***");
		
		System.out.print("Bir sayı giriniz : ");
		int val = Integer.parseInt(kb.nextLine());
		
		if(Prime.isPrimeX(val))
			System.out.printf("%d sayısı şartları sağlamaktadır.", val);		
		else
			System.out.printf("%d sayısı şartları sağlamamaktadır.", val);
		
	}
}
