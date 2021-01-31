
public class FriendsNumbers {
	public static boolean areFriends(int val1, int val2)
	{
		int sum1, sum2;
		
		sum1 = findPositiveDividing(val1);
		sum2 = findPositiveDividing(val2);
		
		return sum1 == val2 && sum2== val1 && val1 != val2 ? true : false;
	}
	
	public static void printResults(int val1, int val2)
	{
		if(FriendsNumbers.areFriends(val1, val2))
			System.out.printf("%d ve %d arkadaş sayılardır.%n", val1, val2);
		else
			System.out.printf("%d ve %d arkadaş sayı değillerdir.%n", val1, val2);
		
	}
	
	public static int findPositiveDividing(int val)
	{
		int sum = 0;
		
		for (int i = 1; i < val; ++i) 
			if(val % i == 0) 
				sum += i;
		return sum;
	}
	
	public static boolean is4Digits(int val)
	{
		int digit = 0;
		while(val > 0) {
			val /= 10;
			digit++;
		}
		return digit == 4 ? true : false;
	}
	
	public static void find4DigitsNumbersAreFriends()
	{
		int val1 = 1000;
		int val2 = 0;
		int temp = 0;
			
		while(val1 < 10000) {
			val2 = findPositiveDividing(val1);
			//The condition (temp != val1) is used to not print the same pair of friends numbers
			if(is4Digits(val2) && areFriends(val1, val2) && temp != val1) {
				System.out.printf("4 basamaklı %d ve %d arkadaş sayılardır.%n", val1, val2);
				temp = val2;
			}
			val1++;
		}
}
